package practice.log;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/28
 * @Version V1.0
 **/
public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);


    public static void main(String[] args) {
        MDC.put("transId", "67539674385");
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");

        Integer[] arr = {1,2,3};
        System.out.println(ArrayUtils.toString(arr));


        Thread thread = new Thread(() -> logger.info("thread1 running"), "thread1name");
        thread.start();
    }
}
