package chapterone;

/**
 * @ClassName WaitTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/29
 * @Version V1.0
 **/
public class WaitTest {
    private static final Object resource = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(() -> {
            synchronized (resource) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(() -> {
            synchronized (resource) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
    }
}
