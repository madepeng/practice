package chapterone;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 20:06
 */
public class ThreadLocalTest {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    static void print(String str) {
        System.out.println(str + ":" + threadLocal.get());
        threadLocal.remove();
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("one before:" + threadLocal.get());
            threadLocal.set("thread one localThrad");
            print("threadone");
            System.out.println("one after:" + threadLocal.get());
        }).start();

        new Thread(() -> {
            System.out.println("two before:" + threadLocal.get());
            threadLocal.set("thread two localThrad");
            print("threadtwo");
            System.out.println("two after:" + threadLocal.get());
        }).start();
    }
}