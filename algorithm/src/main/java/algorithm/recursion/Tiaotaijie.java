package algorithm.recursion;

/**
 * @ClassName Tiaotaijie
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/27
 * @Version V1.0
 **/
public class Tiaotaijie {
    public static void main(String[] args) {
        System.out.println(numWays(0));
    }

    public static int numWays(int n) {
        if (n == 0) return 1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = -1;
        }
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        if(arr[n] ==-1){
            arr[n] = (numWays(n-1) + numWays(n-2))%1000000007;
            return arr[n];
        }else{
            return arr[n];
        }

    }
}
