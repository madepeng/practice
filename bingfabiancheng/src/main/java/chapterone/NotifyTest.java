package chapterone;

/**
 * @ClassName NotifyTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/
public class NotifyTest {
    private static final Object resource = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            synchronized (resource) {
                System.out.println("ThreadA get resource");
                try {
                    System.out.println("ThreadA begin wait");
                    resource.wait();
                    System.out.println("ThreadA end wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (resource) {
                System.out.println("threadB get resource");
                try {
                    System.out.println("threadB begin wait");
                    resource.wait();
                    System.out.println("threadB end wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            synchronized (resource) {
                System.out.println("threadC get resource");
                System.out.println("threadC begin notify");
                resource.notifyAll();
            }
        });

        threadA.start();
        threadB.start();

        Thread.sleep(100);
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();
        System.out.println("main over");
    }
}
