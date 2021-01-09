package design.agency.dynamicImpl;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/24
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        MyLog myLog = new MyLogImpl();

        Object proxy = new LoggerHandler(myLog).getProxy();
        MyLog myLog1 = (MyLog) proxy;
        myLog1.mylog();

        MyCommonLog myCommonLog = (MyCommonLog) proxy;
        myCommonLog.myCommonLog();
        myCommonLog.mylog();

        Advice advice = (Advice) proxy;
        advice.advice();

    }
}
