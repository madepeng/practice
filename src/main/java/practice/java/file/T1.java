package practice.java.file;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * @ClassName T1
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/13
 * @Version V1.0
 **/
public class T1 {
    public static void main(String[] args) {
        Path test = Paths.get("D:\\P00087A001_ST000001_20191205__adpay.txt");
        System.out.println(test);
        System.out.println(Files.exists(test));

        String line = "191205bzcfeaoa2007183661768941250|6236431666003756047|876236431666003756047|9.00";
        String CSV_DELIMITER_STR = "\\|";
        String[] split = line.split(CSV_DELIMITER_STR);
        System.out.println(split.length);

        BigDecimal s = new BigDecimal("0.08");
        BigDecimal b = BigDecimal.valueOf(0.08);
        System.out.println(s.equals(b));
        System.out.println(b.equals(s));
        System.out.println(Objects.equals(s,b));
        System.out.println(s.compareTo(b));
        System.out.println(b.setScale(1,BigDecimal.ROUND_HALF_UP));
    }
}
