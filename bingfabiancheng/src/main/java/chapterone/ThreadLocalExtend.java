package chapterone;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 21:35
 */
public class ThreadLocalExtend {
    static ThreadLocal<String> td = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        td.set("hello");

        new Thread(() -> {
            System.out.println("son:" + td.get());
        }).start();

        System.out.println("main:" + td.get());
    }
}