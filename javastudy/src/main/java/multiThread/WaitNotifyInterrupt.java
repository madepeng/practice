package multiThread;

/**
 * @ClassName WaitNotifyInterrupt
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/27
 * @Version V1.0
 **/
public class WaitNotifyInterrupt {
    static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("begin");
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("end");
        });
        thread.start();

        Thread.sleep(1000);
        System.out.println("main start");
        thread.interrupt();
        System.out.println("main end");
    }
}
