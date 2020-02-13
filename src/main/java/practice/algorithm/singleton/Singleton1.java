package practice.algorithm.singleton;

/**
 * @author 去
 * @description: 单例模式
 * @date 2020/2/1 - 14:29
 */
public class Singleton1 {
    private static Singleton1 singleton = null;

    private Singleton1() {}

    public static Singleton1 getSingleton(){
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}