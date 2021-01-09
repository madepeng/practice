package pingtai.dynamicproxy;

import pingtai.GamePlayer;
import pingtai.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        
        IGamePlayer gamePlayer = new GamePlayer("张三");

        ClassLoader classLoader = String.class.getClassLoader();
        ClassLoader classLoader1 = gamePlayer.getClass().getClassLoader();

        InvocationHandler gamePlayerHandler = new GamePlayerIH(gamePlayer);
        Object proxyInstance = Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), gamePlayer.getClass().getInterfaces(), gamePlayerHandler);
        IGamePlayer proxy = (IGamePlayer) proxyInstance;
        proxy.login("zhangsan","111");
        proxy.killBoss();
        proxy.upgrade();

        URL url = new URL("D:\\jdcode\\mybatis-spring\\src\\main\\java\\practice\\pingtai\\dynamicproxy\\Client.java");
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
        Class<?> aClass = urlClassLoader.loadClass("com.sun.proxy.$Proxy0");
        System.out.println(aClass.getName());
    }
}
