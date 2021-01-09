package multiThread;

/**
 * @ClassName TestCPU
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/26
 * @Version V1.0
 **/
public class TestCPU {
    public static void main(String[] args) {
        final int[] i = {0};
        new Thread(() -> {
            while (true) {
                System.out.println(i[0]);
                i[0]++;
            }
        }).start();
    }
}
