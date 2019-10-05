package practice.generic;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 去
 * @description: TODO
 * @date 2019/9/22 - 9:28
 */
@Data
public class UserPerson<T> {
    List<T> a;
    List<T> b;

    public void init(){
        a = new ArrayList<T>();
        b = new ArrayList<T>();
    }
}