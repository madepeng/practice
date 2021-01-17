package chapterthree;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName CompareAndSetTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/14
 * @Version V1.0
 **/
public class CompareAndSetTest {
    public static void main(String[] args) {
        AtomicLong a = new AtomicLong(9);
        long old, newValue;
        do {
            old = a.get();
            newValue = new AtomicLong(111).get();
        } while (!a.compareAndSet(old, newValue));

        System.out.println(a);
    }
}
