package practice.proxy.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import practice.T;
import practice.proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 19:04
 */
@Data
@AllArgsConstructor
public class StudentHandler implements InvocationHandler {
    private Person target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
//        System.out.println(proxy.toString());
        Object o = method.invoke(target,args);
        System.out.println("after invoke");
        return o;
    }
}