package practice.design.factory.sample1;

/**
 * @ClassName HumanFactory
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuamn(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
