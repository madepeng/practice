package practice.java.digester;

import org.apache.commons.digester.Digester;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/4
 * @Version V1.0
 **/
public class Main {

    public static void main(String[] args) {

        try {
            //1、创建Digester对象实例
            Digester digester = new Digester();

            //2、配置属性值
            digester.setValidating(false);

            //3、push对象到对象栈
            digester.push(new Foo());

            //4、设置匹配模式、规则
            digester.addObjectCreate("foo", "practice.java.digester.Foo");
            digester.addSetProperties("foo");
            digester.addObjectCreate("foo/bar", "practice.java.digester.Bar");
            digester.addSetProperties("foo/bar");
            digester.addSetNext("foo/bar", "addBar", "practice.java.digester.Bar");

            //5、开始解析
            Foo foo = (Foo) digester.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("er.xml"));
            //6、打印解析结果
            System.out.println(foo.getName());
            for (Bar bar : foo.getBarList()) {
                System.out.println(bar.getId() + "," + bar.getTitle());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}