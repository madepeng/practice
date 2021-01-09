package pingtai.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName GamePlayerIH
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamePlayerIH implements InvocationHandler {
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
