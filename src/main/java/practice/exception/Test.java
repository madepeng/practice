package practice.exception;

import java.io.IOException;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/12 - 14:19
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            sinvoked();
        } catch (RuntimeException e) {
//            e.printStackTrace();
        }
        System.out.println("main end");
    }

    public static void sinvoked(){
        try {
                invoked();
        } catch (Exception e) {
//            e.printStackTrace();
//            throw e;
            System.out.println();
        }
        System.out.println(" s end");
    }
    public static void invoked() throws ClassNotFoundException {
        System.out.println("start invoked");
        Integer i = 1/0;
//        Class clazz = Class.forName("fdsf.lang.Integer");
        throw new ClassNotFoundException();
//        System.out.println("end invoked");
    }
}