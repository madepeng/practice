package chapterthree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName NoSafeDateFormate
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/1
 * @Version V1.0
 **/
public class NoSafeDateFormate {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 2;

        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        String[] strings = {"20211111 11:11:11", "20211010 11:11:11","20210101 11:11:11"};
        for (int i = 0; i < threadCount; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
//                String format = dateFormat.format(new Date());
                Date parse = null;
                try {
                    parse = dateFormat.parse(strings[finalI]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
//                String format1 = dateFormat.format(parse);
                System.out.println(parse);
                countDownLatch.countDown();
            });
            thread.start();
        }
        countDownLatch.await();
        System.out.println("end");
    }
}
