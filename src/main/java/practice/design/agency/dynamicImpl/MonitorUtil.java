package practice.design.agency.dynamicImpl;

/**
 * Description：
 *
 * @author madepeng on 2019-05-10
 */
public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<Long>();

    public static void start(){
        tl.set(System.currentTimeMillis());
    }

    public static void finish(String methodName){
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}
