import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class OOMTest {

    private static Unsafe unsafe;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) throws InterruptedException {
        int i = 0;
        List<ByteBuffer> byteBuffers = new ArrayList<>();
        log.info("初始化内存地址:{}", getAddresses(byteBuffers));
        while (true) {
            Byte[] bytes = new Byte[1024 * 1024 * 95];
            byteBuffers.add(ByteBuffer.allocateDirect(1024 * 1024 * 95));
            i++;
            TimeUnit.MILLISECONDS.sleep(1000);
            log.info("当前执行{}次", i);
            log.info("当前内存地址：{}",getAddresses(byteBuffers));
            if (byteBuffers.size() % 10 == 0){
                byteBuffers = new ArrayList<>();
                log.info("新内存地址：{}",getAddresses(byteBuffers));
            }
        }
    }

    public static String getAddresses(Object... objects)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("0x");
        // sun.arch.data.model=32 // 32 bit JVM
        // sun.arch.data.model=64 // 64 bit JVM
        boolean is64bit = Integer.parseInt(System.getProperty("sun.arch.data.model")) == 32 ? false : true;
        long last = 0;
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale)
        {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
                // 输出指针地址
                sb.append(Long.toHexString(i1));
                last = i1;
                for (int i = 1; i < objects.length; i++)
                {
                    final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
                    if (i2 > last)
                        sb.append(", +" + Long.toHexString(i2 - last));
                    else
                        sb.append(", -" + Long.toHexString(last - i2));
                    last = i2;
                }
                break;
            case 8:
                throw new AssertionError("Not supported");
        }
        return sb.toString();
    }
}
