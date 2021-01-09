package multiThread.exceptionTest;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/4 - 14:28
 */
public class TestPrintStackTrace {
    public static void f() throws Exception{
       int i = 1/0;
    }
    public static void g() throws Exception{
        f();
    }
    public static void main(String[] args) {

        try {
            g();
        }catch(Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println();
            e.printStackTrace();
            System.out.println();
            System.out.println(ExceptionUtils.getStackTrace(e));
            System.out.println();
            System.out.println(ExceptionUtils.getStackFrames(e));
        }
        System.out.println("main end");
    }
}