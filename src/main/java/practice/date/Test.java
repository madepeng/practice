package practice.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/2
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String l1 = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String l2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(l1);
        System.out.println(l2);


     /*   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(LocalDateTime.now());
        System.out.println(format);*/

        // 获取当前日期的0点时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(zero));
    }
}
