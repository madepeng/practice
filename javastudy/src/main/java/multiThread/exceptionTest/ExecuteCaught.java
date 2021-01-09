package multiThread.exceptionTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/30 - 14:31
 */
public class ExecuteCaught
{
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newCachedThreadPool();
        try {
            exec.submit(new ThreadPoolTask());
        } catch (Exception e) {
            System.out.println("execute捕获的异常:" + e.toString());
        }


        try {
            Future<?> submit = exec.submit(new ThreadPoolTask());
            Object o = submit.get();
            System.out.println(o);
            exec.shutdown();
        } catch (Exception e) {
            System.out.println("submit捕获的异常：" + e.toString());
        }

        System.out.println("主线程正常结束");
    }
}

class ThreadPoolTask implements Callable
{
    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return 1 / 0;
    }
}