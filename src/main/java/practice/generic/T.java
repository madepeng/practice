package practice.generic;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName T
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/18 20:16
 * @Version 1.0
 */
public class T {
    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>(1,2);
//        myClass.p();

        MyClass<String> myClass1 = new MyClass<>("fsdf", "fdsf");
        myClass1.p();
        String[] a = {"a","b","c"};
        Integer[] b = {1,2,3};
        myClass1.p1(a);
        myClass1.p2(b);
        myClass1.p3(5);
        myClass1.p3(5L);
        myClass1.p3(5.5);
//        myClass1.p3("f");
        myClass1.pp(99);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2));
        List<String> l2 = Lists.newArrayList("d","s");
        myClass1.ppp(l1);
        myClass1.ppp(l2);
    }
}