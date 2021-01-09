package reflect;

import java.lang.reflect.Array;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 14:36
 */
public class ArrayReflection {
    public static void main(String[] args) {
        int[] a = {2,3};
        String[] b = {"fdsf", "fdsf"};

        Class aclass = a.getClass();
        Class bcalass = b.getClass();

        if (aclass.isArray()){
            System.out.println(Array.get(a,0));
        }
        if (bcalass.isArray()){
            Object c = Array.newInstance(bcalass.getComponentType(),10);
            Array.set(b,0,"d");
            String[] d = (String[]) c;
            System.out.println(d.length);
            System.out.println(Array.get(b,0));
        }
    }
}