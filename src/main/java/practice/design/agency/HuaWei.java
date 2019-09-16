package practice.design.agency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/14 - 9:29
 */
public class HuaWei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0, x;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            list.add(x);
        }
        sc.close();
        System.out.println(m);
        System.out.println(n);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
        int sum = 0;
        while (list.size() > m){
            sum += list.get(0);
            for (int i = 1; i < m; i++) {
                list.set(i, list.get(i) - list.get(0));
            }
            list.remove(0);
        }

        sum += list.get(list.size() - 1);
        System.out.println(sum);
    }
}