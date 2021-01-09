package stream.donghui;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/17
 * @Version V1.0
 **/
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        LOGGER.info("start");
        try {
            throw new RuntimeException("test");
        } catch (Exception e) {
            LOGGER.error("test:{},e:{},last:{}", e.getMessage(), e, "fdsfdsf");
        }
//        LOGGER.error("wolaigeuomk,fdsf:{}", "name", new Exception("fdsfds"));
        String s = "fsdfdsf%d,%d";
        String format = String.format(s, 10, 19,11);
        System.out.println(format);
        Person p1 = new Person(1, "2020-10-22");
        Person p2 = new Person(1, "2020-10-21");
        Person p3 = new Person(2, "2020-10-20");
        Person p4 = new Person(2, "2020-10-19");
        Person p5 = new Person(3, "2020-10-18");
        Person p6 = new Person(3, "2020-10-7");

        List<Person> personList = Lists.asList(p1, new Person[]{p2, p3, p4, p5, p6});
        List<Person> collect = personList.stream().sorted(Comparator.comparing(Person::getDate)).filter(distinctByKey(Person::getId)).collect(Collectors.toList());
        collect.forEach(System.out::println);

        ArrayList<Person> collect1 = personList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                new TreeSet<>(Comparator.comparing(Person::getId).reversed())), ArrayList::new
        ));

        System.out.println(collect1);
        /*Map<String,String> map = new HashMap<>();
        System.out.println(map.putIfAbsent("1","a"));
        System.out.println(map.putIfAbsent("1","b"));
        System.out.println(map.putIfAbsent("1","c"));
        System.out.println(map.get("1"));*/

    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Throwable throwable = new Throwable();
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            System.out.println(stackTraceElement.getClassName()+ ":" + stackTraceElement.getMethodName()+ ":"+stackTraceElement.getLineNumber());
        }
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
