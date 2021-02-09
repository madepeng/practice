package pingtai;

import sun.misc.Unsafe;

/**
 * @ClassName UnSafeTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/4
 * @Version V1.0
 **/
public class UnSafeTest {
    private Integer fff = 0;
    private static long valueOffset;
    static Unsafe unsafe = Unsafe.getUnsafe();
    static {
        try {
            valueOffset = unsafe.objectFieldOffset(UnSafeTest.class.getDeclaredField("fff"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UnSafeTest test = new UnSafeTest();
//        unsafe.compareAndSwapInt(t)
    }
}
