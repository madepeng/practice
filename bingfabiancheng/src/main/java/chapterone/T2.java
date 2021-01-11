package chapterone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName T2
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class T2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(T2.class);
    static String lock = "lock";

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (lock) {
                LOGGER.info("A:获得锁");
                while (true) {
                    try {
                        LOGGER.info("A:休眠1秒");
                        Thread.sleep(1000);
                        LOGGER.info("A:释放锁");
                        lock.wait();
                        LOGGER.info("A:被唤醒");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            try {
                synchronized (lock) {
                    LOGGER.info("B:我开始执行");
                    lock.notify();             // 这一步是唤醒其他线程，让他们具有获取锁的资格
                    Thread.sleep(10000);
                    LOGGER.info("B:我执行完成"); // 执行完成后，自然而然的释放锁，具有获取锁资格的线程开始夺取锁
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
