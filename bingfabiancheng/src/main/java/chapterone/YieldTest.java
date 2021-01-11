package chapterone;

/**
 * @ClassName YieldTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class YieldTest implements Runnable {
    public YieldTest() {
        Thread t = new Thread(this);
        t.start();
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() +":" + i);
            if (i%5 == 0) {
                System.out.println(Thread.currentThread() + "yield cpu");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread() + "is over");
    }
}
