package practice.java.stream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.Objects;
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
        Person p1 = new Person("m1", "a1", "1");
        Person p2 = new Person("m1", "a2", "2");
        Person p3 = new Person("m1", "a3", "3");
        Person p4 = new Person("m2", "a4", "4");
        Person p5 = new Person("m2", "a5", "5");
        Person p6 = new Person("m3", "a6", "6");

        List<Person> list = Lists.newArrayList(p1, p2, p3, p4, p5, p6);
        final Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(collect);

        final Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println(collect1);

        Long collect2 = list.stream().collect(Collectors.counting());
        System.out.println(collect2);

        Map<String, List<Person>> collect3 = list.stream().collect(Collectors.groupingBy(Person::getAddress, Collectors.toList()));
        System.out.println(collect3);

        System.out.println(JSON.toJSONString(p1));
        System.out.println(JSONObject.toJSONString(p1));
        System.out.println(JSON.toJSONString(p1).equals(JSONObject.toJSONString(p1)));

        String s = "10";
        Integer i = 10;
        System.out.println(s.equals(i));
        System.out.println(i.equals(s));
        System.out.println(Objects.equals(s, i));
        System.out.println(s.equals(String.valueOf(i)));
    }
}
