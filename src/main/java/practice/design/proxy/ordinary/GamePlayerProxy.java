package practice.design.proxy.ordinary;

/**
 * @ClassName GamePlayerProxy
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/25
 * @Version V1.0
 **/
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player;

    public GamePlayerProxy(String name) throws Exception {
        this.player = new GamePlayer(name, this);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }

    @Override
    public void login(String name, String password) {
        this.player.login(name, password);
    }
}
