package other;

import org.apache.commons.lang3.time.FastDateFormat;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateFormat
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/1
 * @Version V1.0
 **/
public class DateFormat {

    public static void main(String[] args) {
        int count = 200;
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            FastDateFormat fastDateFormat =  FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
            String format = fastDateFormat.format(new Date());
        }
        long l = System.currentTimeMillis();
        System.out.println("count1:" + (l - start));
        for (int i = 0; i < count; i++) {
            DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
            String print = dateTimeFormat.print(new DateTime(new Date()));
        }

        long l1 = System.currentTimeMillis();
        System.out.println("count2:" + (l1 - l));

        for (int i = 0; i < count; i++) {
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        }
        long l2 = System.currentTimeMillis();
        System.out.println("count3:" + (l2 - l1));


    }
}
