package practice.algorithm.leetcode;

/**
 * @ClassName fib1
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/3
 * @Version V1.0
 **/
public class fib1 {
    public static int fib(int n) {
        int a=0,b=1,sum;
        for(int i=0;i<n;i++){
            sum=(a+b)% 1000000007;
            a=b;
            b=sum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
    }
}
