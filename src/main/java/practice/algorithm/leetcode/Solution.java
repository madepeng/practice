package practice.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/3/6
 * @Version V1.0
 **/
class Solution {
    public static void main(String[] args) {
        final int[][] res = findContinuousSequence(9);
        List<String> t = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            String str = "";
            for (int i1 = 0; i1 < res[i].length; i1++) {
                if (res[i][i1]!=0) {
                    str = str  + res[i][i1] +",";
                }
            }
            System.out.println(str);
            if (!str.equals("")) {
                t.add(str);
            }
        }


    }
    public static int[][] findContinuousSequence(int target) {
        int[][] res = new int[target/2][target/2];
        int k=0;
        for(int i=1;i<= target/2;i++){
            int j = i;
            int sum = 0;
            int[] temp = new int[target/2];
            int m=0;
            while(sum<target){
                sum += j;
                temp[m]=j;
                j++;
                m++;
                if(sum==target){
                    res[k] = temp;
                    k++;
                    break;
                }
            }
        }

        return res;
    }
}
