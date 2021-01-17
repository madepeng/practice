package chapterthree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @ClassName RandomTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/13
 * @Version V1.0
 **/
public class RandomTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RandomTest.class);

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    LOGGER.info(String.valueOf(random.nextInt(50)));
                }
            }).start();
        }

    }
}
