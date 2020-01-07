package practice.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName TestXmlBean
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Data
public class TestJavaBean {
    @ApolloConfig("application")
    private Config config;

    @Value("${timeout}")
    private int timeout;

    @Value("${batch}")
    private int batch;
}
