package practice;

/**
 * @author 去
 * @description: Integer是否相等的例子
 * @date 2019/6/10 - 12:52
 */
public class BasicTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);

        Integer i5 = 1;
        Integer i6 = 1;
        System.out.println(i5 == i6);

        Integer i3 = new Integer(129);
        Integer i4 = new Integer(129);
        System.out.println(i3 == i4);

        Integer i7 = 129;
        Integer i8 = 129;
        System.out.println(i7 == i8);
    }
}