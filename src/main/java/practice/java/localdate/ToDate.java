package practice.java.localdate;

import com.google.common.collect.ImmutableMap;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @ClassName ToDate
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/17
 * @Version V1.0
 **/
public class ToDate {
    final ImmutableMap<String, String> map = ImmutableMap.of("k1", "v1", "k2", "v2");

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = LocalDateTime.now().plusDays(3).atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
        Date date = Date.from(zdt.toInstant());
        System.out.println(date.toString());//Tue Mar 27 14:17:17 CST 2018

        final ImmutableMap<String, String> map = ImmutableMap.of("k1", "v1", "k2", "v2","k3","v3"
        ,"k4","v4","k5","v5");
        final ImmutableMap.Builder<Object, Object> put = ImmutableMap.builder().put("1", "1").put("2", "2").put("3", "3").put("4", "4").put("5", "5").put("6", "6");
        System.out.println(put.build());
        System.out.println(map);
        ImmutableMap.copyOf(put.build());
    }
}
