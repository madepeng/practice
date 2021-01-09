package design.factory.sample1;

/**
 * @ClassName YelloHuman
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public class YelloHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我是黄种人");
    }

    @Override
    public void talk() {
        System.out.println("我说双音节话");
    }
}
