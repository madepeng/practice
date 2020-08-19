package practice.java.exception;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName TT
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/18 11:02
 * @Version 1.0
 */
public class TT {
    public static int main(String[] args) {
//        LocalDateTime ld = LocalDateTime.parse("20190830103508");
//        System.out.println(ld);
        LocalDate ld = LocalDate.parse("20190830", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate ld1 = LocalDate.parse("20190831", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(ld.compareTo(ld1));
        System.out.println(ld.isBefore(ld1));

        LocalTime lt = LocalTime.parse("103508",DateTimeFormatter.ofPattern("HHmmss"));
        System.out.println(lt);
        int x = 1, y = 2;
        return (x > y) ? 1 : (x == y ? 0 : -1);
    }
}