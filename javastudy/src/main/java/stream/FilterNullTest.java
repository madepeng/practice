package stream;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName FilterTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/26
 * @Version V1.0
 **/
public class FilterNullTest {
    public static void main(String[] args) throws NoSuchFieldException {
        ArrayList<Person> people = Lists.newArrayList(new Person("1", "1", "1"), new Person("2", "2", "2"),
                new Person("3", "3", "3"));

        int sum = people.stream().filter(person -> person.getAge().contains("1")).map(Person::getAge).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);

        Stream<Person> personStream = people.stream().filter(person -> person.getAge().contains("1"));
//        System.out.println(personStream.collect(Collectors.toList()));
        Stream<String> stringStream = personStream.map(Person::getAge);
//        System.out.println(stringStream.collect(Collectors.toList()));
        IntStream intStream = stringStream.mapToInt(Integer::valueOf);
        System.out.println(intStream.findFirst().getAsInt());

        Person p = new Person("4", "4", "4");
        Field ddd = p.getClass().getDeclaredField("ddd");
        System.out.println(ddd);
        Field age = p.getClass().getDeclaredField("age");
        System.out.println(age);

    }
}
