package practice;

/**
 * @author 去
 * @description: TODO
 * @date 2019/7/7 - 11:42
 */
public class T {
    public int test(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        T t = new T();
        try {
            int res = t.test(11,0);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("some exception");
        }

        System.out.println("end");

    }
}