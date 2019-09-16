package practice.multiThread.exceptionTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/30 - 14:31
 */
public class ExecuteCaught
{
    public static void main(String[] args)
    {
        Thread.currentThread().setUncaughtExceptionHandler((t, e) -> System.out.println("自定义异常处理器：" + t.getName() + e.toString()));
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ThreadPoolTask());
        int i = 1/0;
        exec.shutdown();
        throw new RuntimeException("madep");
    }
}

class ThreadPoolTask implements Runnable
{
    @Override
    public void run()
    {
//        Thread.currentThread().setUncaughtExceptionHandler((t, e) -> System.out.println("自定义异常处理器：" + t.getName() + e.toString()));
        System.out.println(3/2);
//        System.out.println(3/0);
        System.out.println(3/1);
//        throw new RuntimeException("fdsfdsf");
    }
}