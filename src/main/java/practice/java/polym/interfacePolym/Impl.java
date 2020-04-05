package practice.java.polym.interfacePolym;

/**
 * @ClassName Impl
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/4
 * @Version V1.0
 **/
public class Impl implements interface1, interface2 {
    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }
}
