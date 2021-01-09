package timer;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName Test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/21 14:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Executors.newFixedThreadPool(1);
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(1);
        Executors.newSingleThreadExecutor();

        // 延时任务
        System.out.println(LocalDateTime.now());

        // 定时任务 按照上一次任务的发起时间计算下一次任务的开始时间.scheduleWithFixedDelay以上一次任务的结束时间计算下一次任务的开始时间
        AtomicInteger i = new AtomicInteger();

        Thread.sleep(5);
    }
}