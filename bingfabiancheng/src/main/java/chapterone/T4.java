package chapterone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName T4
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class T4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(T4.class);

    static volatile String lock = "lock";
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("A");
                }
            }
        },"AAA").start();
    }
}
