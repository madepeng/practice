package design.agency.staticImpl;

/**
 * @ClassName IGamePlayer
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/8
 * @Version V1.0
 **/
public interface IGamePlayer {
    //登录游戏
    void login(String user, String password);
    //杀怪，这是网络游戏的主要特色
    void killBoss();
    //升级
    void upgrade();
}
