package oom;

import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OOMTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/21
 * @Version V1.0
 **/
public class OOMTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OOMTest.class);

    public static void main(String[] args) {
        System.out.print("最大内存： ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "MB");
        System.out.print("可用内存： ");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");
        System.out.print("已使用内存： ");
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");

        Thread mThreadTest = new Thread(() -> {
            List<byte[]> list = new ArrayList<>();
            while (true) {
                LOGGER.info(FastDateFormat.getInstance("yyyyMMdd HH:mm:ss.sss").format(new Date()) + Thread.currentThread() + "==");
                byte[] b = new byte[1024 * 10240 * 1];
                list.add(b);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        mThreadTest.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    LOGGER.info("test");
                }

            }
        }).start();
    }
}

