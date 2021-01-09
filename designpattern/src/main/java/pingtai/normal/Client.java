package pingtai.normal;

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
        IGamePlayer player = new GamePlayer("张三");
        player.login("zhangsan","111");
        player.killBoss();
        player.upgrade();
    }
}
