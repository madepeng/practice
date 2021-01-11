package chapterone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName T3
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class T3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(T3.class);

    static String lock = "lock";
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                LOGGER.info("A wait");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOGGER.info("A run");
            }
        });
        thread.start();
        Thread.sleep(1000);
        LOGGER.info("A interrupt");
        thread.interrupt();
    }
}
