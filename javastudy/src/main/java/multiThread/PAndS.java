package multiThread;

/**
 * @ClassName PAndS
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/27
 * @Version V1.0
 **/
public class PAndS {
    public static void main(String[] args) {
        new Thread(() -> {
            int i = 0;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = 10;
            System.out.println(i);
        }).start();

        System.out.println("Main end");
    }


}
