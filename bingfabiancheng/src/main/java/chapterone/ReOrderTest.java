package chapterone;

import sun.misc.Contended;

/**
 * @ClassName ReOrderTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/11
 * @Version V1.0
 **/
@Contended
public class ReOrderTest {
    private static int num = 0;
    private static boolean ready = false;

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
                System.out.println("read thread ...");
            }
        }
    }

    public static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over ...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadThread readThread = new ReadThread();
        readThread.start();

        WriteThread writeThread = new WriteThread();
        writeThread.start();

        Thread.sleep(80);
        readThread.interrupt();
        System.out.println("main exit");
    }
}
