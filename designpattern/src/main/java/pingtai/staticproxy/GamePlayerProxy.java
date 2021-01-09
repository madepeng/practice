package pingtai.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pingtai.IGamePlayer;

/**
 * @ClassName GamePlayerProxy
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    @Override
    public void login(String user, String password) {
        gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
