package design.factory.sample1;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        final YelloHuman huamn = factory.createHuamn(YelloHuman.class);
        huamn.getColor();
        huamn.talk();
    }
}
