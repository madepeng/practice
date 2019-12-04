package practice.num;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimalTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/22
 * @Version V1.0
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.99));
        System.out.println(new BigDecimal(0.99).toString());
        System.out.println(new BigDecimal("0.99"));
        System.out.println(BigDecimal.valueOf(0.99));
        System.out.println(BigDecimal.valueOf(0.99f));
        System.out.println(BigDecimal.valueOf(100));
        System.out.println(BigDecimal.valueOf(100f));
        System.out.println(BigDecimal.valueOf(100.0));
        System.out.println(BigDecimal.valueOf(100d));
    }
}
