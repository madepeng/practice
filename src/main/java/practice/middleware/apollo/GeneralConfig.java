package practice.middleware.apollo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GeneralConfig
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/10
 * @Version V1.0
 **/
@Configuration
public class GeneralConfig {
    @Bean
    public TestJavaBean javaConfigBean() {
        return new TestJavaBean();
    }

    @Bean
    public TestApolloAnnotationBean testApolloAnnotationBean() {
        return new TestApolloAnnotationBean();
    }
}
