package chapterfour;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName AtomicLongTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/5
 * @Version V1.0
 **/
public class AtomicLongTest {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(1);
        System.out.println(atomicLong);
        System.out.println(atomicLong.incrementAndGet());
    }
}
