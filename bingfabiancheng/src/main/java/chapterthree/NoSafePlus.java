package chapterthree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName NoSafePlus
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/1
 * @Version V1.0
 **/
public class NoSafePlus {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoSafePlus.class);
    static int sum = 0;
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 1000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        CountDownLatch latch = new CountDownLatch(1);

        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum++;
                LOGGER.info(sum+"");
                countDownLatch.countDown();
            });
            thread.start();
        }
        latch.countDown();
        countDownLatch.await();
        LOGGER.info("main:" +sum);
    }
}
