package practice.design.agency.dynamicImpl;

/**
 * @ClassName MyLogImpl
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/24
 * @Version V1.0
 **/
public class MyLogImpl implements MyLog {
    @Override
    public void mylog() {
        System.out.println("mylog invoke");
    }
}
