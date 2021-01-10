package chapterone;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 12:36
 */
@Data
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private Queue<String> queue;

    public void puduct() {
        synchronized (queue) {
            while (queue.size() == 10) {
                try {
                    LOGGER.info("生产者：队列满，阻塞自己并释放锁");
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            LOGGER.info("生产者：队列不满，生产元素s");
            queue.add("s");
            queue.notify();
        }
    }
}