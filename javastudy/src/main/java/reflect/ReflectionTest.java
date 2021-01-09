package reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 10:22
 */
public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("madepneg");
        Field f = p.getClass().getDeclaredField("name");
        f.setAccessible(true);
        Object o = f.get(p);
        System.out.println(o);

        AccessibleObject.setAccessible(p.getClass().getFields(), true);
        String s = "madepengfdsfdsf";
        Field ff = s.getClass().getDeclaredField("value");
        ff.setAccessible(true);
        Object oo = ff.get(s);
        if (oo instanceof char[]){
            char[] ooo = (char[]) oo;
            for (int i = 0; i < ooo.length; i++) {
                System.out.println(ooo[i]);
            }
        }

        Person[] ps = {p,p};
        System.out.println(ps.length);
        ps = Arrays.copyOf(ps, ps.length*3);
        System.out.println(ps.length);
    }
    public static void printFields(Class clazz){
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String modi = Modifier.toString(field.getModifiers());
            String type = field.getType().getName();
            String name = field.getName();
            System.out.println(modi + " " + type + " " + name);
        }
    }
    public static void printMethods(Class clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            String modifier = Modifier.toString(method.getModifiers());
            String returnType = method.getReturnType().getName();
            Class[] ts = method.getParameterTypes();
            String tss = "";
            for (int i1 = 0; i1 < ts.length; i1++) {
                tss = tss.concat(ts[i1].getName()).concat(" ");
            }
            System.out.println(modifier + " " + returnType + " " + method.getName() + " " + tss);
        }
    }
}