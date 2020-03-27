package practice.design.factory.sample1;

/**
 * @ClassName BlackHuman
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我是黑种人");
    }

    @Override
    public void talk() {
        System.out.println("我说你听不懂的话");
    }
}
