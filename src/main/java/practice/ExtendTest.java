package practice;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/19 - 9:28
 */
public class ExtendTest {
    public static void main(String[] args) {
        String s = "s";
        Integer integer = 66;
        Object[] objects = {s, integer};
        String ss = (String)objects[0];
        System.out.println(ss);

        if (objects[0] instanceof Integer){
            Integer sss = (Integer) objects[0];
            System.out.println(sss);
        }
        String d = null;
        Long l = Long.valueOf(d);
        System.out.println(l);
    }
}