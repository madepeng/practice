package pingtai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName NoSafePlus
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/3
 * @Version V1.0
 **/
public class NoSafePlus {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoSafePlus.class);
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 1000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        Plus plus = new Plus();

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
               plus.inc();
                LOGGER.info("" + plus.getSum());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("main:"+plus.getSum());
    }
}
