package practice.design.agency.staticImpl;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName GamePlayerIH
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/21
 * @Version V1.0
 **/
@Data
@NoArgsConstructor
public class GamePlayerIH implements InvocationHandler {
    private Object target;
    private Object proxy;

    public GamePlayerIH(Object target) {
        this.target = target;

        Class<?>[] targetInterfaces = target.getClass().getInterfaces();
        Class<?>[] proxyInterfaces = new Class<?>[target.getClass().getInterfaces().length + 1];

        System.arraycopy(targetInterfaces, 0, proxyInterfaces, 0, targetInterfaces.length);
        proxyInterfaces[proxyInterfaces.length - 1] = Add.class;

        this.proxy = (Add)Proxy.newProxyInstance(target.getClass().getClassLoader(), proxyInterfaces.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mName = method.getName();

        // ignore all non-log methods
        if (!"log".equals(mName)) {
            return method.invoke(target, args);
        }

        System.out.println("调用了Add接口的add方法");
        return null;
    }
}
