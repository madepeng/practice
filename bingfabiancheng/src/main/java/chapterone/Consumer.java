package chapterone;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 12:39
 */
@Data
public class Consumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
    private Queue<String> queue;

    public void consume() {
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    LOGGER.info("消费者：队列为空，阻塞自己并释放锁");
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            LOGGER.info("消费者：队列不为空，消费一个");
            queue.remove();
            queue.notify();
        }
    }
}