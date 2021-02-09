package pingtai;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName UnSafePlus
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/4
 * @Version V1.0
 **/
public class UnSafePlus {
    static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 2;
        CountDownLatch latch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                sum++;
                System.out.println(sum);
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("main:" + sum);
    }
}
