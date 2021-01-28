package chapterone.PandC;

/**
 * @ClassName TestConsumerAndProducer
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/
public class TestConsumerAndProducer {

    public static void main(String[] args) {
        Resource resource = new Resource();
        //生产线程
        Producer p1 = new Producer(resource);
        //消费线程
        Consumer c1 = new Consumer(resource);

        new Thread(p1).start();

        new Thread(c1).start();
    }
}
