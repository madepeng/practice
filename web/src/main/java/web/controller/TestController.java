package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName TestController
 * @Description: 测试controller
 * @Author madepeng
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Controller
public class TestController {

    @RequestMapping(value = "/test/apollo")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        /*final Config config = bean.getConfig();
        System.out.println(config);

//        System.out.println(config == anotherConfig);
//        System.out.println(mySpace);
        mv.setViewName("index");
        mv.addObject("res1", bean.getConfig() == config);
        mv.addObject("res2", bean.getMyNameSpace() == mySpace);*/
        return mv;
    }
}
