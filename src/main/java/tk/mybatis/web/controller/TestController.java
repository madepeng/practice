package tk.mybatis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import practice.apollo.TestXmlBean;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Controller
public class TestController {

    @Resource
    private TestXmlBean bean;

    @RequestMapping(value = "/test/apollo")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        int timeout = bean.getTimeout();
        System.out.println(timeout);

        mv.setViewName("index");
        mv.addObject("result", bean);
        return mv;
    }
}
