package design.factory.sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/14 - 10:08
 */
public class HuaWei1 {
    static class CPU {
        int time;

        public CPU() {
            time = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] task = new int[n];
        for (int i = 0; i < n; i++) {
            task[i] = in.nextInt();
        }
        in.close();
        List<CPU> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(new CPU());
        }
        Arrays.sort(task);

        int total = 0;
        int index = 0;
        while (true){
            int i = getZ(list);
            if (i == 101){
                break;
            }
            if (i>=0){
                if (index ==n){
                    list.remove(i);
                }else {
                    list.get(i).time =task[index];
                    index++;
                }
            }else {
                total -= i;
            }
        }
        System.out.println(total);
    }

    static int getZ(List<CPU> list){
        if (list.size() == 0)
            return 101;
        int min = 100;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).time == 0){
                return i;
            }
            min =min > list.get(i).time ? list.get(i).time:min;
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).time -= min;
        }
        return  -min;
    }
}