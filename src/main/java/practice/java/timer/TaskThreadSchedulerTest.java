package practice.java.timer;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.Date;

/**
 * @ClassName TaskThreadSchedulerTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/7
 * @Version V1.0
 **/
public class TaskThreadSchedulerTest {
    public static void main(String[] args) {
        ThreadPoolTaskScheduler taskThreadScheduler = new ThreadPoolTaskScheduler();
        taskThreadScheduler.initialize();
        System.out.println(FastDateFormat.getInstance("yyyyMMdd HH:mm:ss").format(new Date()));

//        taskThreadScheduler.execute(() -> System.out.println(FastDateFormat.getInstance("yyyyMMdd HH:mm:ss").format(new Date())), 10000);
//        taskThreadScheduler.scheduleAtFixedRate(() -> System.out.println(FastDateFormat.getInstance("yyyyMMdd HH:mm:ss").format(new Date())), 10000);
        taskThreadScheduler.schedule(() -> {
            System.out.println(FastDateFormat.getInstance("yyyyMMdd HH:mm:ss").format(new Date()));
        }, DateUtils.addSeconds(new Date(),5));
//        taskThreadScheduler.shutdown();
//        System.out.println(taskThreadScheduler.isDaemon());
//        taskThreadScheduler.schedule()
    }
}
