package chapterone.PandC;

/**
 * @ClassName Producer
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/26
 * @Version V1.0
 **/

public class Producer implements Runnable {

    private Resource resource;

    public Producer(Resource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        while (true){
            resource.put();
        }
    }
}