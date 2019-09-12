package practice.multiThread.exceptionTest;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/30 - 10:06
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExceptionTask());
        // 用日志记录下错误
        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("自定义异常处理器：" + t.getName() + e.toString()));
        thread.start();
        System.out.println("main thread end");
    }
}