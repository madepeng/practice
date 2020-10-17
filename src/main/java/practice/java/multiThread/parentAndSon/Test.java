package practice.java.multiThread.parentAndSon;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/9/10
 * @Version V1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            log.info("one:" + Thread.currentThread().getName());
            new Thread(() -> {
                log.info("two:" + Thread.currentThread().getName());
                new Thread(() -> {
                    log.info("three:" + Thread.currentThread().getName());
                }).start();
            }).start();
        }).start();

        final long ONE_MILLION = 100_0000L;
        System.out.println(ONE_MILLION);
    }


}
