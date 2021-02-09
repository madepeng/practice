package other;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName FastDateSafe
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/1
 * @Version V1.0
 **/
public class FastDateSafe {
    private static final FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 20000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        long l = System.currentTimeMillis();
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
//                fastDateFormat.format(new Date());
                try {
                    fastDateFormat.parse("2021-11-11 11:11:11");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                /*try {
                    format.parse("2021-11-11 11:11:11");
                } catch (ParseException e) {
                    e.printStackTrace();
                }*/
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        System.out.println("main over");
    }
}
