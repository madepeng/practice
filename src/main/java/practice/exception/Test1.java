package practice.exception;

import org.springframework.cglib.core.CollectionUtils;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/12 - 17:43
 */
public class Test1 {
    public static void main(String[] args) {
        g();
    }

    public static void g(){
        System.out.println("t start");
        try {
            t();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("t end");
    }

    public static void t(){
        System.out.println(2/2);
        System.out.println(1/0);
        System.out.println(2/3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}