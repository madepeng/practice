package chapterone;

/**
 * @ClassName DeadLockTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class DeadLockTest {
    static volatile Object resourceA = new Object();
    static volatile Object resourceB = new Object();

    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            synchronized (resourceA) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceB) {
                    System.out.println("A");
                }
            }
        });


        Thread b = new Thread(() -> {
            synchronized (resourceB) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceA) {
                    System.out.println("B");
                }
            }
        });

        a.start();
        b.start();
    }
}
