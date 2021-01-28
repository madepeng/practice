package design.proxy.cglib;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/21
 * @Version V1.0
 **/
public class Dog {
    final public void run(String name) {
        System.out.println("狗"+name+"----run");
    }

    public void eat() {
        System.out.println("狗----eat");
    }
}
