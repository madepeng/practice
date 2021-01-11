package chapterone;

/**
 * @ClassName InterruptTest1
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/10
 * @Version V1.0
 **/
public class InterruptTest1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true){

            }
        });

        thread.start();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(thread.isInterrupted());
    }
}
