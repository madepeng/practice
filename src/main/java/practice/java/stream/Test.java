package practice.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/24
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
       List<Integer> l1 = Arrays.asList(1,2,3);
       List<Integer> l2 = Arrays.asList(4,5,6);
       List<Integer> l3 = Arrays.asList(7,8,9);

        Stream<Stream<Integer>> stream = Stream.of(l1.stream(), l2.stream(), l3.stream());
        Stream<Integer> integerStream1 = stream.flatMap(integerStream -> integerStream);
//        System.out.println(integerStream1.collect(Collectors.toList()));

        List<List<Integer>> ll = Arrays.asList(l1,l2,l3);
        Stream<Integer> integerStream = ll.stream().flatMap(integers -> integers.stream());

//        System.out.println(integerStream.collect(Collectors.toList()));

        System.out.println(integerStream1.equals(integerStream));
        System.out.println(integerStream1.collect(Collectors.toList()).equals(integerStream.collect(Collectors.toList())));

        Stream<Integer> integerStream2 = l1.stream().map(Function.identity());
        System.out.println(integerStream2.collect(Collectors.toList()));
    }
}
