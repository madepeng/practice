package multiThread.Stop;

import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @ClassName InterruptTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/26
 * @Version V1.0
 **/
public class InterruptTest extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterruptTest.class);

    private volatile int index;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            LOGGER.info("index:" + index);
            index++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptTest test = new InterruptTest();
        test.start();
        Thread.sleep(1000);
        test.interrupt();
        LOGGER.info(FastDateFormat.getInstance().format(new Date()));
    }
}
