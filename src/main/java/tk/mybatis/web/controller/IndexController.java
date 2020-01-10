package tk.mybatis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.web.model.SysDict;

import java.util.Date;

/**
 * @author liuzh
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"", "/index"})
    public ModelAndView dicts() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now", new Date());
        return mv;
    }

    @RequestMapping(value = "/test")
    public SysDict test(){
        SysDict sysDict = new SysDict(11L,"testcode","madepeng","madepeng");
        return sysDict;
    }
}
