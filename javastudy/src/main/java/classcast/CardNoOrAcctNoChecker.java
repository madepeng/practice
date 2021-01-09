package classcast;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @ClassName CardNoOrAcctNoChecker
 * @Description: 卡号和账户号二选一检查器
 * @Author madepeng
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class CardNoOrAcctNoChecker {
    public static <T> String check(Object object, Class<T> clazz) throws NoSuchFieldException, IllegalAccessException {
        T cast = ClassCastUtil.cast(object, clazz);
        final Field name = cast.getClass().getDeclaredField("name");
        name.setAccessible(true);
        final Object o = name.get(cast);
        System.out.println(o);
        int[] aa = {6,7,4,5,2,1};
        Arrays.sort(aa);
        for (int i : aa) {
            System.out.println(i);
        }
        for (int i = 0; i < 100  ; i++) {

        }
        return "";
    }
}
