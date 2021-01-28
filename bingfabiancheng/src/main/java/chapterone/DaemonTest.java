package chapterone;

/**
 * @ClassName DaemonTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/
public class DaemonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {

            }
        });
//        thread.setDaemon(true);
        thread.start();
        System.out.println("main over");
    }
}
