package chapterone;

/**
 * @ClassName T
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/9
 * @Version V1.0
 **/
public class T extends Thread{
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("runable"));
        t.start();

        T t1 = new T();
        t1.start();
    }

    @Override
    public void run() {
        super.run();
    }
}
