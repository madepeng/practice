package stream;

import com.alibaba.fastjson.JSONArray;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Reduce
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/1
 * @Version V1.0
 **/
public class Reduce {
    public static void main(String[] args) {

        consumeTest();
        functiontest();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Optional<Integer> reduce = list.stream().reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.orElse(0));

        List<BigDecimal> list1 = new ArrayList<>();
        list1.add(BigDecimal.valueOf(5));
        list1.add(new BigDecimal("4.3"));
        list1.add(BigDecimal.valueOf(4.5));

        Optional<BigDecimal> reduce1 = list1.stream().reduce(BigDecimal::add);
        System.out.println(reduce1.orElse(BigDecimal.ZERO));

        Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(integer -> integer, integer -> integer));
        System.out.println(collect);

        TreeSet<Integer> collect1 = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect1);

        JSONArray collect2 = list.stream().collect(Collectors.toCollection(JSONArray::new));
        System.out.println(collect2);

        List<Integer> collect3 = list.stream().flatMap(integer -> Stream.of(integer, integer + 1)).collect(Collectors.toList());
        System.out.println(collect3);


    }

    public static void consumeTest() {
        Consumer f = System.out::println;
        Consumer f2 = n -> System.out.println(n + "f2");

        f.accept("f");
        f2.accept("f2");

        f.andThen(f2).accept("test");
    }

    public static void functiontest() {
        Function<String, String> function = s -> s.concat("function");
        Function<String, String> f2 = s -> s.concat("f2");

        System.out.println(function.apply("ma"));
        System.out.println(function.andThen(f2).apply("de"));
        System.out.println(Function.identity().apply("peng"));
        System.out.println(function.compose(f2).apply("gg"));

        Function<String, Integer> f3 = s -> {
            return Integer.valueOf(s);
        };

        Function<String, Integer> f4 = s -> Integer.valueOf(s);

        System.out.println(f3.apply("5"));
        System.out.println(f4.apply("6"));

        ToIntFunction<String> f5 = value -> Integer.valueOf(value);
        System.out.println(f5.applyAsInt("9"));
    }

    public static <T extends Comparable<T>> T min(T[] a)  {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 1 ; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        }
        return smallest; }

}
