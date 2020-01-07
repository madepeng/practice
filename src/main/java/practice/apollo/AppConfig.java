package practice.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Configuration
@EnableApolloConfig(value = {"MyNameSpace", "application"})
public class AppConfig {
    @Bean
    public TestJavaBean javaConfigBean() {
        return new TestJavaBean();
    }
}

