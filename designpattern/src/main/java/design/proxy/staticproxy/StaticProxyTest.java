package design.proxy.staticproxy;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 18:48
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Person p = new Student("zhangsan");
        Person sp = new StudentProxy(p);
        sp.giveMoney();
    }
}