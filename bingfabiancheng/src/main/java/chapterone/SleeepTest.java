package chapterone;

/**
 * @ClassName SleeepTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/
public class SleeepTest {
    private static final Object lock = new Object();
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("ThreadTwo sleep");
                try {
                    Thread.sleep(1000);
                    System.out.println("ThreadTwo end");
                } catch (InterruptedException e) {
                    System.out.println("I am interrupted");
                }
            }
        });
        thread.start();
        thread.interrupt();
        System.out.println("main end");
    }
}
