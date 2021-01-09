package design.agency.staticImpl;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/21
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
      /*  IGamePlayer gamePlayer = new GamePlayer("test");
        Class<?>[] interfaces = gamePlayer.getClass().getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        IGamePlayer proxyInstance = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, new GamePlayerIH(gamePlayer));
        proxyInstance.login("mmmm", "ffff");
        proxyInstance.killBoss();
        proxyInstance.upgrade();

        Advice proxyInstance1 = (Advice) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{Advice.class}, new GamePlayerIH(gamePlayer));
        proxyInstance1.advice();

        Object o = Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class, Advice.class}, new GamePlayerIH(gamePlayer));
        IGamePlayer ll1 = (IGamePlayer) o;
        Advice ll2 = (Advice) o;

        ll1.upgrade();
        ll2.advice();*/

        IGamePlayer gamePlayer  = new GamePlayer("test");
        Object proxy = new GamePlayerIH(gamePlayer).getProxy();

        IGamePlayer ll1 = (IGamePlayer) proxy;
        ll1.upgrade();

        Add ll3 = (Add) proxy;
        ll3.add();
        ll3.upgrade();
    }
}
