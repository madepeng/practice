package practice.java.multiThread.exceptionTest;

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
            exec.execute(new ThreadPoolTask());
        } catch (Exception e) {
            System.out.println("execute捕获的异常:" + e.toString());
        }


        try {
            Future<?> submit = exec.submit(new ThreadPoolTask());
            submit.get();
            exec.shutdown();
        } catch (Exception e) {
            System.out.println("submit捕获的异常：" + e.toString());
        }
    }
}

class ThreadPoolTask implements Runnable
{
    @Override
    public void run()
    {
//       int a = 1 / 0;
        throw new RuntimeException("fdsfdsf");
    }
}