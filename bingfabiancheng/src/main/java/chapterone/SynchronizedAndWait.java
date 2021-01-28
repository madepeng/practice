package chapterone;

/**
 * @ClassName T5
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/28
 * @Version V1.0
 **/
public class SynchronizedAndWait {
    private static final Object resource = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource){
                try {
                    System.out.println("A runing and ready sleep");
                    Thread.sleep(10000);
                    System.out.println("A sleep end and wait");
                    resource.wait();
                    System.out.println("A end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (resource){
                try {
                    System.out.println("B runing and ready wait");
                    resource.wait();
                    System.out.println("B end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
/*
        new Thread(() -> {
            synchronized (resource){
                System.out.println("C runing and ready notify");
                resource.notifyAll();
            }
        }).start();*/
    }
}
