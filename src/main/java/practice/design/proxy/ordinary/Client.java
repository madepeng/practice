package practice.design.proxy.ordinary;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/26
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        IGamePlayer gamePlayer = new GamePlayerProxy("zhangsan");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
