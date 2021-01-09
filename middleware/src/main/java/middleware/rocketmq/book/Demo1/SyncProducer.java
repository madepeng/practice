package middleware.rocketmq.book.Demo1;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @ClassName SyncProducer
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/2
 * @Version V1.0
 **/
public class SyncProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("test1");
        producer.setNamesrvAddr("172.19.184.120:9876");
        producer.start();
        for (int i = 0; i < 100; i++) {
            Message message = new Message("test1", "1", ("hello world!" + i).getBytes());
            SendResult result = producer.send(message);
            System.out.println(result);
        }
        producer.shutdown();
    }
}
