package practice.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 去
 * @description: TODO
 * @date 2019/5/222:20
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
    }
}