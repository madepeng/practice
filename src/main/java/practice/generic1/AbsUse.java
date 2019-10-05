package practice.generic1;

import java.util.ArrayList;

/**
 * @author 去
 * @description: TODO
 * @date 2019/9/22 - 9:41
 */
public class AbsUse<T extends IStu> implements IUse<T> {
    protected ArrayList<T> list;

    public void init(){
        list = new ArrayList<T>();
    }
}