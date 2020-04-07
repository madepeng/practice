package practice.java.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName group
 * @Description: 分组
 * @Author madepeng
 * @Date 2020/2/3
 * @Version V1.0
 **/
public class group {
    public static void main(String[] args) {
        Person p1 = new Person("m1", "a1");
        Person p2 = new Person("m1", "a2");
        Person p3 = new Person("m1", "a3");
        Person p4 = new Person("m2", "a4");
        Person p5 = new Person("m2", "a5");
        Person p6 = new Person("m3", "a6");

        List<Person> list = Lists.newArrayList(p1,p2,p3,p4,p5,p6);
        final Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(collect);

        final Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println(collect1);

        Long collect2 = list.stream().collect(Collectors.counting());
        System.out.println(collect2);

        Map<String, List<Person>> collect3 = list.stream().collect(Collectors.groupingBy(Person::getAddress, Collectors.toList()));
        System.out.println(collect3);
    }
}
