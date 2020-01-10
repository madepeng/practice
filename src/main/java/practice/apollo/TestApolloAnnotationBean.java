package practice.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;

/**
 * @ClassName TestApolloAnnotationBean
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/9
 * @Version V1.0
 **/
public class TestApolloAnnotationBean {
    @ApolloConfig
    private Config config; //inject config for namespace application
    @ApolloConfig("application")
    private Config anotherConfig; //inject config for namespace application
    @ApolloConfig("MyNameSpace")
    private Config myNameSpace; //inject config for namespace FX.apollo

  /*  *//**
     * ApolloJsonValue annotated on fields example, the default value is specified as empty list - []
     * <br />
     * jsonBeanProperty=[{"someString":"hello","someInt":100},{"someString":"world!","someInt":200}]
     *//*
    @ApolloJsonValue("${jsonBeanProperty:[]}")
    private List<JsonBean> anotherJsonBeans;

    @Value("${batch:100}")
    private int batch;

    //config change listener for namespace application
    @ApolloConfigChangeListener
    private void someOnChange(ConfigChangeEvent changeEvent) {
        //update injected value of batch if it is changed in Apollo
        if (changeEvent.isChanged("batch")) {
            batch = config.getIntProperty("batch", 100);
        }
    }

    //config change listener for namespace application
    @ApolloConfigChangeListener("application")
    private void anotherOnChange(ConfigChangeEvent changeEvent) {
        //do something
    }

    //example of getting config from Apollo directly
    //this will always return the latest value of timeout
    public int getTimeout() {
        return config.getIntProperty("timeout", 200);
    }

    //example of getting config from injected value
    //the program needs to update the injected value when batch is changed in Apollo using @ApolloConfigChangeListener shown above
    public int getBatch() {
        return this.batch;
    }

    private static class JsonBean{
        private String someString;
        private int someInt;
    }*/
}
