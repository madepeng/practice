package practice.proxy.dynamicproxy;

import practice.proxy.staticproxy.Person;
import practice.proxy.staticproxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 19:07
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Student("lisi");
        InvocationHandler ih = new StudentHandler(p);
        Person proxy = (Person)Proxy.newProxyInstance(p.getClass().getClassLoader(), new Class[]{Person.class},ih);
        proxy.giveMoney();
        proxy.study();
    }
}