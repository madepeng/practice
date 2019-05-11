package practice.design.agency.dynamicImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description：
 *
 * @author madepeng on 2019-05-10
 */
public class StuInvocationHandler<T> implements InvocationHandler {
    T t;

    public StuInvocationHandler(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        MonitorUtil.start();
        Object result = method.invoke(t,args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
