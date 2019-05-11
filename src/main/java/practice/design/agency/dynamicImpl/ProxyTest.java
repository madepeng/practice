package practice.design.agency.dynamicImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Description：
 *
 * @author madepeng on 2019-05-10
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
        Person zhangsan = new Student("张三");

        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        stuProxy.giveMoney();
    }
}
