package chapterone;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 去
 * @description: TODO
 * @date 2021/1/10 - 11:39
 */
public class T1 implements Callable<String> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new T1());
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }

    @Override
    public String call() throws Exception {
        return "hello world";
    }
}