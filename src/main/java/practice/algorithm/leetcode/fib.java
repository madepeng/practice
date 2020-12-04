package practice.algorithm.leetcode;

/**
 * @ClassName fib
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/11/26
 * @Version V1.0
 **/
public class fib {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i =2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int fib = fib(0);
        System.out.println(fib);
        Integer[][] mm = new Integer[2][2];
        for (int i = 0; i < mm.length; i++) {
            for (int i1 = 0; i1 < mm[0].length; i1++) {
                System.out.println(mm[i][i1]);
            }
        }
    }
}
