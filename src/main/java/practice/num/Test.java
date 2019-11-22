package practice.num;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(4.5562);
        System.out.println(bigDecimal);
  /*      BigDecimal bigDecimal1 = bigDecimal.setScale(2);
        System.out.println(bigDecimal1);*/
        BigDecimal bigDecimal2 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal2);
    }
}
