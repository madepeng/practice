package chapterone;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 19:30
 */
public class ParentAndSonAndUser {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {

            }
        });

        thread.setDaemon(true);
        thread.start();

        System.out.println("main over");

    }
}