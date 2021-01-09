package multiThread.Stop;

/**
 * @ClassName Flag
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/26
 * @Version V1.0
 **/
public class Flag extends Thread {
    private volatile  boolean exit = false;
    private volatile int index = 0;

    @Override
    public void run() {
        while (!exit) {
            System.out.println(index);
            index ++;
        }
    }

    public static void main(String[] args) {
        Flag flag = new Flag();
        flag.start();
        while (flag.index <= 100) {

        }
        System.out.println("stop index:" + flag.index);
        flag.exit = true;
        System.out.println("main end");
    }
}
