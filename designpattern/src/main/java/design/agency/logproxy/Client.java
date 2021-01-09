package design.agency.logproxy;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/29
 * @Version V1.0
 **/
public class Client {
    private static final CommonLogger LOGGER = CommonLoggerFactory.getLogger(Client.class);

//    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
       /* LOGGER.info("test fdsfdfsdfdsfdsfdsf");

        logger.info("test  test");*/
        LOGGER.log("111","ffffff");
        LOGGER.info("zhanweifu:{}","woshiwohahahaha");
        Throwable throwable = new Throwable();
        StackTraceElement[] ste = throwable.getStackTrace();
        for (StackTraceElement stackTraceElement : ste) {
            System.out.println(stackTraceElement.getClassName()+":"+stackTraceElement.getMethodName()+":"+stackTraceElement.getLineNumber());
        }
//        LOGGER.info("zhanweifu1:{},zhanweifu2:{}，zhanweifu3:{},zhanweifu4:{}",null,"22222222222","3333","444");
       /* logger.info("zhanweifu1:{},zhanweifu2:{}","11111111","22222222222");
        logger.info("zhanweifu1:{},zhanweifu2:{}，zhanweifu3:{}","11111111","22222222222","3333");
        logger.info("zhanweifu1:{},zhanweifu2:{}，zhanweifu3:{},zhanweifu4:{}","11111111","22222222222","3333","444");

        String s=null;
        logger.info("zhanweifu1:{},zhanweifu2:{}，zhanweifu3:{},zhanweifu4:{}",s,"22222222222");
*/
    }
}
