package practice;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 去
 * @description: 验证java的方法参数是按值调用的
 * 1.基本类型不可改变值
 * 2.引用类型可以改变状态
 * 3.引用类型不可指向新对象
 * @date 2019/5/3 - 10:45
 */
@Data
public class Test {

    public static void main(String[] args) throws ParseException {
        System.out.println("190829bzifi1741420111572806856389".hashCode());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());
/*        */
        LocalDate now = LocalDate.now();
        LocalDate lastDayOfCurrentMouth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfCurrentMouth);
        LocalDateTime ldt = LocalDateTime.now();
       LocalDateTime lll = ldt.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lll);

        lll =  lll.withHour(23);
        System.out.println(lll);


        LocalDate date = LocalDate.parse("2019-09-09");

        LocalDateTime ma = LocalDateTime.of(date.with(TemporalAdjusters.lastDayOfMonth()), LocalTime.MAX).withNano(0);
        System.out.println("ma:" + ma);


        LocalDateTime tradeDate = LocalDateTime.of(LocalDate.parse("2019-09-09").with(TemporalAdjusters.lastDayOfMonth()),
                LocalTime.MAX).withNano(0);
        System.out.println("de:"+tradeDate);

        String s = "8d";
        System.out.println(NumberUtils.isDigits(s));


    }
}