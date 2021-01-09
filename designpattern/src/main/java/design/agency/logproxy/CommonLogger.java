package design.agency.logproxy;

import org.slf4j.Logger;

/**
 * FCoreLogger extends Slf4j {@link Logger} and adds log method for message id
 * 
 * @author liweimin
 */
public interface CommonLogger extends Logger {
    /**
     * Output the log message represents by <code>messageId</code>
     * 
     * @param messageId message id
     * @param args message arguments
     */
    void log(String messageId, Object... args);


}
