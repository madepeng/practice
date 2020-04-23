package practice.java.multiThread.exceptionTest;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/30 - 10:05
 */
public class ExceptionTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("异步线程运行...");
            int a = 1/0;
        } catch (RuntimeException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getStackTrace()[0]);
            System.out.println(e.getStackTrace()[1]);
        }
    }
}