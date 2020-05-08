package practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.middleware.apollo.PersonBean;

/**
 * @author 去
 * @description: spring容器测试
 * @date 2020/1/12 - 15:00
 */
public class ContextTest {
    public static void main(String[] args) {
        String conf = "applicationContext.xml";
        //创建容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext(conf);
        //得到Example对象
        PersonBean e1 = context.getBean("person",PersonBean.class);
        PersonBean e2 = context.getBean("person",PersonBean.class);
        System.out.println(e1 == e2);
        System.out.println(context.getApplicationName());
        System.out.println(context.getDisplayName());
        System.out.println(context.getBeansOfType(PersonBean.class));
        System.out.println(context.getEnvironment());
    }
}