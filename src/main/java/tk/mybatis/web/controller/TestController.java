package tk.mybatis.web.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import practice.middleware.apollo.PersonBean;
import practice.middleware.apollo.TestJavaBean;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Description: 测试controller
 * @Author madepeng
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Controller
public class TestController {

    @Resource
    private TestJavaBean bean;

    @Value("${path}")
    private String path;

    @ApolloConfig
    private Config config;

    @ApolloConfig("application")
    private Config anotherConfig;


    @ApolloConfig("MyNameSpace")
    private Config mySpace;

    @Value("${key1}")
    private String key1;

    @Resource
    private PersonBean personBean;

    @RequestMapping(value = "/test/apollo")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        final Config config = bean.getConfig();
        System.out.println(config);

//        System.out.println(config == anotherConfig);
//        System.out.println(mySpace);
        mv.setViewName("index");
        mv.addObject("res1", bean.getConfig() == config);
        mv.addObject("res2", bean.getMyNameSpace() == mySpace);
        return mv;
    }
}
