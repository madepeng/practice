package practice.java.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list.size());
    }
}