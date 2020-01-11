package tk.mybatis.web.apoll;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 去
 * @description: TODO
 * @date 2020/1/5 - 20:36
 */
@Service
public class TestApolloAnnotationBean {
    @ApolloConfig
    private Config config; //inject config for namespace application
    @ApolloConfig("application")
    private Config anotherConfig; //inject config for namespace application

    @Value("${key1}")
    private String key1;

    public void getKey(){
        String s = key1;
        System.out.println(s);
    }
}