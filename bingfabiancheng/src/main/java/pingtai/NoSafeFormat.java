package pingtai;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName NoSafeFormat
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/3
 * @Version V1.0
 **/
public class NoSafeFormat {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoSafeFormat.class);
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static AtomicInteger integer = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        String[] dates = {"2021-02-03 16:09:40","2011-09-16 16:09:40"};
        int threadCount = 15;
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    Date date = DateUtils.addDays(new Date(), integer.incrementAndGet());
                    LOGGER.info(String.valueOf(integer));
                    String format = NoSafeFormat.format.format(date);
                    LOGGER.info(format);
                    latch.countDown();

                } finally {

                }
            }).start();
        }
        latch.await();
        LOGGER.info("end");

    }
}
