package practice.design.factory.sample1;

/**
 * @ClassName WriteHuman
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public class WriteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }

    @Override
    public void talk() {
        System.out.println("我说单音节话");
    }
}
