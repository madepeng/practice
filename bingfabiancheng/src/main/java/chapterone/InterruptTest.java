package chapterone;

/**
 * @ClassName InterruptTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread() + "hello");
            }
        });

        thread.start();

        Thread.sleep(1000);

        System.out.println("main interrupt");
        thread.interrupt();


        thread.join();
        System.out.println("main over");
    }
}
