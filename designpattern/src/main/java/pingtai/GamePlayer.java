package pingtai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName GamePlayer
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/4
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamePlayer implements IGamePlayer{
    private String name;
    @Override
    public void login(String user, String password) {
        System.out.println("登陆名为" + user + "的用户" + name + "登陆成功");
    }

    @Override
    public void killBoss() {
        System.out.println(name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "又升了一级");
    }
}
