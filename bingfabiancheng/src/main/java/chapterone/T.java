package chapterone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName T
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/9
 * @Version V1.0
 **/
public class T extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(T.class);

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("runable");
        });
        t.start();

        T t1 = new T();
        t1.start();

    }

    @Override
    public void run() {
        LOGGER.info("extend Thread");
    }
}