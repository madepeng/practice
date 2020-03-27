package practice.design.proxy.ordinary;

/**
 * @ClassName GamePlayer
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/25
 * @Version V1.0
 **/
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name, IGamePlayer player) throws Exception {
        if (player == null) {
            throw new Exception("can not!");
        }else {
            this.name = name;
        }
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "upgrade");
    }

    @Override
    public void login(String name, String password) {
        System.out.println(this.name + "login");
    }
}
