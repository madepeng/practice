package practice.java.exception;

import practice.design.agency.staticImpl.Student;

import java.util.Objects;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/6 - 10:43
 */
public class T {
    public static void main(String[] args) throws RuntimeException{
        Integer i1 = 88;
        Integer i2 = 88;
        System.out.println(Objects.equals(i1,i2));
        System.out.println(Objects.deepEquals(i1,i2));

        String s1 = "s";
        String s2 = "s";
        System.out.println(Objects.equals(s1,s2));
        System.out.println(Objects.deepEquals(s1,s2));

        Student st1 = new Student("s");
        Student st2 = new Student("s");
        System.out.println(Objects.equals(st1,st2));
        System.out.println(Objects.deepEquals(st1,st2));
        Double d = null;
        System.out.println(String.valueOf(d));
        System.out.println();
        System.out.println();

    }
}