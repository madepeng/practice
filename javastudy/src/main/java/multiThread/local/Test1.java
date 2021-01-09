package multiThread.local;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/8/19
 * @Version V1.0
 **/
@Slf4j
public class Test1 {
    public static void main(String[] args) {
        ThreadLocal<String> local = new InheritableThreadLocal<>();

        Random random = new Random();
        local.set(random.nextInt(10) + "");
        log.info(Thread.currentThread().getName() + "," + local.get());

        IntStream.range(0, 3).forEach(value -> {
            new Thread(() -> {
                log.info("value:" + local.get());
            }).start();
        });

        local.set("99999");
        log.info(Thread.currentThread().getName() + "," + local.get());
        IntStream.range(0, 3).forEach(value -> {
            new Thread(() -> {
                log.info("value:" + local.get());
            }).start();
        });
    }
}
