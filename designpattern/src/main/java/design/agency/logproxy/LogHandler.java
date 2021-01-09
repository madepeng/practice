package design.agency.logproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Supplier;

/**
 * @ClassName LogHandler
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/29
 * @Version V1.0
 **/
public class LogHandler implements InvocationHandler {
    private static Logger LOGGER = LoggerFactory.getLogger(LogHandler.class);
    private static final String FQCN = LogHandler.class.getName();

    /**
     * Target logger
     */
    private final Logger target;
    /**
     * Proxy logger
     */
    private final CommonLogger proxy;

    public CommonLogger getFLogger() {
        return proxy;
    }

    public LogHandler(Logger target) {
        this.target = target;

        Class<?>[] targetInterfaces = target.getClass().getInterfaces();
        Class<?>[] proxyInterfaces = new Class<?>[target.getClass().getInterfaces().length + 1];

        System.arraycopy(targetInterfaces, 0, proxyInterfaces, 0, targetInterfaces.length);
        proxyInterfaces[proxyInterfaces.length - 1] = CommonLogger.class;

        this.proxy = (CommonLogger) Proxy.newProxyInstance(target.getClass().getClassLoader(), proxyInterfaces, this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mName = method.getName();
        String targetName = null;

        // ignore all non-log methods
        if (!"log".equals(mName)) {
            Throwable throwable = new Throwable();
            StackTraceElement[] ste = throwable.getStackTrace();
            for (StackTraceElement stackTraceElement : ste) {
                System.out.println(stackTraceElement.getClassName() + ":" + stackTraceElement.getMethodName() +
                        ":" + stackTraceElement.getLineNumber());
                if (stackTraceElement.getClassName().contains("com.sun.proxy.$Proxy")) {
                    targetName = stackTraceElement.getClassName();
                }
            }

            log(args, mName, targetName);
            return null;
        }

        // all parameter types
        Class<?>[] paramTypes = method.getParameterTypes();

        // main parameter type
        Class<?> firstParamType = paramTypes[0];

        String messageId = null;
        Object[] logArgs = null;

        if (firstParamType == String.class) {
            messageId = (String) args[0];
            if (args.length > 1) {
                logArgs = (Object[]) args[1];
            }
        }
        Throwable throwable = new Throwable();
        StackTraceElement[] ste = throwable.getStackTrace();
        for (StackTraceElement stackTraceElement : ste) {
            System.out.println(stackTraceElement.getClassName() + ":" + stackTraceElement.getMethodName() +
                    ":" + stackTraceElement.getLineNumber());
        }

//        log(logArgs);


        return null;
    }

    private void log(Object[] args, String mName, String targetName) {

        String level = mName;

        LocationAwareLogger logger = (LocationAwareLogger) target;
        switch (level) {
            case "trace":
                log(logger::isTraceEnabled, LocationAwareLogger.TRACE_INT, logger, args[0].toString(), null, targetName);
                break;
            case "debug":
                log(logger::isDebugEnabled, LocationAwareLogger.DEBUG_INT, logger, args[0].toString(), null, targetName);
                break;
            case "info":
                log(logger::isInfoEnabled, LocationAwareLogger.INFO_INT, logger, args[0].toString(), null, targetName);
                break;
            case "warn":
                log(logger::isWarnEnabled, LocationAwareLogger.WARN_INT, logger, args[0].toString(), null, targetName);
                break;
            case "error":
                log(logger::isErrorEnabled, LocationAwareLogger.ERROR_INT, logger, args[0].toString(), null, targetName);
                break;
            default:
                LOGGER.error("日志模板[{}]的等级配置有误:{}", level, level);
        }
    }

    private static void log(Supplier<Boolean> check, int level, LocationAwareLogger logMsg, String msg,
                            Object[] args, String targetName) {
        if (check.get()) {
            logMsg.log(null, targetName, level, msg, null, null);
        }
    }
}
