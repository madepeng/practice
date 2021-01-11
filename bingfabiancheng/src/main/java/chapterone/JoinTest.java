package chapterone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName JoinTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class JoinTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JoinTest.class);

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("A run");
        });

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("B run");
        });

        LOGGER.info("main run");

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        LOGGER.info("main end");
    }
}
