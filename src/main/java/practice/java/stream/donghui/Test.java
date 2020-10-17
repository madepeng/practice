package practice.java.stream.donghui;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/17
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1, "2020-10-22");
        Person p2 = new Person(1, "2020-10-21");
        Person p3 = new Person(2, "2020-10-20");
        Person p4 = new Person(2, "2020-10-19");
        Person p5 = new Person(3, "2020-10-18");
        Person p6 = new Person(3, "2020-10-7");

        List<Person> personList = Lists.asList(p1, new Person[]{p2, p3, p4, p5, p6});
        List<Person> collect = personList.stream().sorted(Comparator.comparing(Person::getDate)).distinct().collect(Collectors.toList());
        collect.forEach(person -> System.out.println(person));
    }
}
