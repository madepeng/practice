package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListForeachDelete
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/27
 * @Version V1.0
 **/
public class ListForeachDelete {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("1");
            list.add("2");
        }

        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if ("1".equals(next)){
                iterator.remove();
            }
        }*/
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("1")){
                list.remove(i);
            }
        }*/

        //后面两种可以，下面两种不可以

        list.forEach(s -> {
            if (s.equals("1")){
                list.remove(s);
            }
        });
       /* for (String s : list) {
            if ("1".equals(s)){
                list.remove(s);
            }
        }*/
        System.out.println(list);

    }
}
