package practice.java.bigdecimaltest;

import java.math.BigDecimal;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/29
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("0.00");
        System.out.println(decimal);
        System.out.println(decimal.scale());
        System.out.println(BigDecimal.ZERO.scale());
        System.out.println(decimal.compareTo(BigDecimal.ZERO) == 0);
    }
}
