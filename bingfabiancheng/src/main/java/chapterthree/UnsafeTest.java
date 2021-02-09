package chapterthree;

import lombok.Data;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassName UnsafeTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/11
 * @Version V1.0
 **/
@Data
public class UnsafeTest {
    static Unsafe unsafe;
    static long stateOffset;
    private volatile long state = 0;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
            stateOffset = unsafe.objectFieldOffset(UnsafeTest.class.getDeclaredField("state"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) throws NoSuchFieldException {
        UnsafeTest test = new UnsafeTest();
        boolean success = unsafe.compareAndSwapLong(test, stateOffset, 0, 1);
        System.out.println(stateOffset);
        System.out.println(test.getState());
        System.out.println(success);
    }
}
