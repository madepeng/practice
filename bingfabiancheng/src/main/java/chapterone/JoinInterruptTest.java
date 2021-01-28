package chapterone;

/**
 * @ClassName JoinInterruptTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/
public class JoinInterruptTest {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println("A runing");
            while (true) {

            }
        });

        Thread mainThread = Thread.currentThread();
        Thread threadTwo = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mainThread.interrupt();
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
        } catch (InterruptedException e) {
            System.out.println("main interrupted");
        }
    }
}
