package algorithm.recursion;

/**
 * @ClassName Feiboshu
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/27
 * @Version V1.0
 **/
public class Feiboshu {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static Integer f(int n) {
        if (n <= 2) return 1;
        return f(n-1) + f(n-2);
    }
}
