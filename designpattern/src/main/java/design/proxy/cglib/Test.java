package design.proxy.cglib;

import com.alibaba.fastjson.JSONArray;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/21
 * @Version V1.0
 **/
public class Test {
    public String test () {
        return "my test";
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Test.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "hello world";
            }
        });
        Test test = (Test) enhancer.create();
        System.out.println(test.test());
        System.out.println(test.toString());
        System.out.println(test.clone());
        System.out.println(test.getClass());

        JSONArray objects = JSONArray.parseArray("[{\"name\":\"mdp\"},{\"age\":\"11\"}]");
        System.out.println(objects);
    }
}
