package reflection;

import java.lang.reflect.Constructor;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/27
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String s = "fdsfds";
        String s1 = "fd";
        System.out.println(s.getClass().getName());
        System.out.println(s.getClass() == s1.getClass());

        Constructor<?>[] declaredConstructors = s.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
        }

        Long l = 5355216766582145462L;
        System.out.println(l % 2);

        Long ll = null;
        System.out.println(String.valueOf(ll));
    }
}
