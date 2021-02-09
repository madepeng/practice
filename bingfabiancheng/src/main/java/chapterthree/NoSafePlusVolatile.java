package chapterthree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName NoSafePlusVolatile
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/2
 * @Version V1.0
 **/
public class NoSafePlusVolatile {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoSafePlusVolatile.class);
    static volatile int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> {
                sum++;
                sum++;
//                LOGGER.info(sum+"");
//                System.out.println();
                countDownLatch.countDown();
            });
            thread.start();
        }
        countDownLatch.await();
        LOGGER.info("main:" +sum);
    }
}
