package design.factory.sample1;

/**
 * @ClassName AbstractHumanFactory
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/13
 * @Version V1.0
 **/
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuamn(Class<T> clazz);
}
