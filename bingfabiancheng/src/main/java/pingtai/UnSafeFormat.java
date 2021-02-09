package pingtai;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName UnSafeFormat
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/4
 * @Version V1.0
 **/
public class UnSafeFormat {
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        int threadCount = 2;
        String[] strings = {"2020-11-11 11:11:11", "2021-09-06 07:22:22"};
        AtomicInteger index  = new AtomicInteger(1);
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                String format = UnSafeFormat.format.format(DateUtils.addDays(new Date(),index.incrementAndGet()));
                System.out.println(format);
            }).start();
        }

    }
}
