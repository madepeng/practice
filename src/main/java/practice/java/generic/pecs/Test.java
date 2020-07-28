package practice.java.generic.pecs;

import java.util.TreeSet;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/28
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        TreeSet<Person> ts1 = new TreeSet<>(new comparatorTest());
        ts1.add(new Person("Tom", 20));
        ts1.add(new Person("Jack", 25));
        ts1.add(new Person("John", 22));
        System.out.println(ts1);

        TreeSet<Student> ts2 = new TreeSet<>(new comparatorTest());
        ts2.add(new Student("Susan", 23));
        ts2.add(new Student("Rose", 27));
        ts2.add(new Student("Jane", 19));
        System.out.println(ts2);
    }
}
