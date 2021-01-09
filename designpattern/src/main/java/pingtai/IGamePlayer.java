package pingtai;

/**
 * @ClassName IGamePlayer
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
public interface IGamePlayer {
    void login(String user,String password);
    void killBoss();
    void upgrade();
}
