package practice.design.agency.dynamicImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName LoggerHandler
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/24
 * @Version V1.0
 **/
public class LoggerHandler implements InvocationHandler {
    private Object target;
    private Object proxy;

    public LoggerHandler(MyLog target) {
        this.target = target;

        Class<?>[] targetInterfaces = target.getClass().getInterfaces();
        Class<?>[] proxyInterfaces = new Class<?>[target.getClass().getInterfaces().length + 2];

        System.arraycopy(targetInterfaces, 0, proxyInterfaces, 0, targetInterfaces.length);
        proxyInterfaces[proxyInterfaces.length - 2] = MyCommonLog.class;
        proxyInterfaces[proxyInterfaces.length - 1] = Advice.class;

        this.proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), proxyInterfaces, this);
    }

    public Object getProxy() {
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mName = method.getName();

        // ignore all non-log methods
        if (!"myCommonLog".equals(mName) && !"advice".equals(mName)) {
            return method.invoke(target, args);
        }

        if (mName.equals("myCommonLog")){
            System.out.println("myCommonLog");

        }else {
            System.out.println("advice");
        }

        return null;
    }
}
