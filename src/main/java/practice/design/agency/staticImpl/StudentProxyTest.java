package practice.design.agency.staticImpl;

/**
 * Description：静态代理测试
 *
 * @author madepeng on 2019-05-07
 */
public class StudentProxyTest {
    public static void main(String[] args) {
        Person madepeng = new Student("madepeng");
        Person studentProxy = new StudentProxy(madepeng);
        studentProxy.giveMoney();
    }
}
