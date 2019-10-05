package practice.generic1;

/**
 * @author 去
 * @description: TODO
 * @date 2019/9/22 - 9:43
 */
public class UseImpl<T extends IStu> extends AbsUse<IStu> {

    public void init(){
        list.add(new StuImpl());
    }
}