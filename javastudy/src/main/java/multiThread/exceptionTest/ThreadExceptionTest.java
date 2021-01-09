package multiThread.exceptionTest;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/30 - 10:06
 */
public class ThreadExceptionTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                int a = 1 / 0;
                System.out.println("new thread end");
            } catch (Exception e) {
                System.out.println("异步线程自己捕获了异常：" + e.toString());
//                throw new Exception("异步线程自己抛出的异常");
            }
        });
        // 用日志记录下错误
        thread.setUncaughtExceptionHandler((t, e) ->
        {
            System.out.println("自定义异常处理器：" + t.getName() + e.toString());

        });
        thread.start();
//        Thread.sleep(1000);
        System.out.println("main thread end");
    }
}