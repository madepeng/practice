package practice.design.proxy.ordinary;

import lombok.Data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Person
 * @Description: 构造函数的任意写法
 * @Author madepeng
 * @Date 2020/2/25
 * @Version V1.0
 **/
@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, String password) {
        this.name = name;
    }

    public Person(int age) {
        System.out.println("my age is:" + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("sss", "pppp");
        Person p2 = new Person(111);
        System.out.println(p1.age);
        p1.setName(null);
        System.out.println(p1.name);
        System.out.println(p1.name == null);
        System.out.println(p2.name);
        System.out.println(p2.age);
        final String[] split = "1,2,33".split(",");
        final List<String> list = Arrays.asList(split);
        list.removeIf(s -> s.length()==1);
        final String[] split1 = "1,33".split(",");
        final List<String> list1 = Arrays.asList(split1);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list.containsAll(list1));
        System.out.println(9/2);
        int[] temp = {};
        System.out.println(temp);
        System.out.println(temp);
        System.out.println(String.format("日期是:%tc", new Date()));
    }
}
