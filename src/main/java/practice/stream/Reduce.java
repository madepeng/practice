package practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * @ClassName Reduce
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/1
 * @Version V1.0
 **/
public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        consumeTest();
        functiontest();
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
}
