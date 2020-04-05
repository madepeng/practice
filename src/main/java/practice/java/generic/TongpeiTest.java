package practice.java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TongpeiTest
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/23 11:04
 * @Version 1.0
 */
public class TongpeiTest {
    public static void main(String[] args) {
        List<Parent> pL = new ArrayList<>();
        pL.add(new Parent("p1"));
        pL.add(new Parent("p2"));
        pL.add(new Parent("p3"));
        pL.add(new Parent("p4"));

        List<Son> sL = new ArrayList<>();
        sL.add(new Son("s1"));
        sL.add(new Son("s2"));
        sL.add(new Son("s3"));
        sL.add(new Son("s4"));

        test(pL);
        test(sL);

        List<? extends Parent> list = sL;
        Parent l = list.get(0);
        System.out.println(l);

        test1(pL);
        test1(sL);
        List<? super Son> list1 = pL;
        list1.set(0, new Son());
        Parent son = pL.get(0);
    }

    public static void test1(List<? super Son> list){
        System.out.println(list);
    }

    public static void test(List<? extends Parent> list){
        System.out.println(list);
    }
}