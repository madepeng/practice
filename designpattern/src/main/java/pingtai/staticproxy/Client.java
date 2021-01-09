package pingtai.staticproxy;

import pingtai.GamePlayer;
import pingtai.IGamePlayer;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer iGamePlayerProxy = new GamePlayerProxy(gamePlayer);
        iGamePlayerProxy.login("zhangsan","111");
        iGamePlayerProxy.killBoss();
        iGamePlayerProxy.upgrade();
    }
}
