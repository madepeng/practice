package design.agency.dynamicImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName MyLogImpl
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/24
 * @Version V1.0
 **/
public class MyLogImpl implements MyLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogImpl.class);
    @Override
    public void mylog() {
        LOGGER.info("mylog invoke");
    }
}
