package design.agency.logproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * liweimin - CommonLoggerFactory
 */
public class CommonLoggerFactory {

    /**
     * 默认构造函数
     */
    private CommonLoggerFactory() {

    }

    private static final Map<String, Object> LOGGER_MAP = new WeakHashMap<>();
  /*  static {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getFrameworkPackages().add("com.baidu.fbu.fcore.common.logger.LoggerHandler");
        loggerContext.getFrameworkPackages().add("com.sun.proxy.$Proxy");
    }*/

    public static <T> T getLogger(Class<?> cz) {
        return (T) getLogger(cz.getName());
    }

    public static <T> T getLogger(String name) {
        Object logger = LOGGER_MAP.get(name);

        if (logger == null) {
            synchronized (name.intern()) {
                logger = LOGGER_MAP.get(name);
                if (logger == null) {
                    Logger target = LoggerFactory.getLogger(name);
                    logger = new LogHandler(target).getFLogger();
                    LOGGER_MAP.put(name, logger);
                }
            }
        }

        return (T) logger;
    }
}
