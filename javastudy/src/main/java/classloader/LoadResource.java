package classloader;

import org.apache.ibatis.javassist.runtime.Inner;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @ClassName LoadResource
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/17
 * @Version V1.0
 **/
public class LoadResource {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassLoader cl = LoadResource.class.getClassLoader();
        URL resource = cl.getResource("aa.txt");
        System.out.println(resource);

        InputStream resourceAsStream = cl.getResourceAsStream("aa.txt");
        System.out.println(resourceAsStream);

        System.out.println(System.getProperty("java.class.path"));

        Inner inner = new Inner();
        System.out.println(inner.getClass().getName());
        System.out.println(inner.getClass().toString());
        System.out.println(inner.getClass().getClassLoader().toString());

//        LoadResource.class.getResourceAsStream()
        InputStream i1 = Class.forName("classloader.LoadResource").getResourceAsStream("/config.properties");
        InputStream i2 = LoadResource.class.getClassLoader().getResourceAsStream("config.properties");
        printProperties(i1);
        printProperties(i2);

    }


    private static void printProperties(InputStream input) throws IOException {
        Properties properties = new Properties();
        properties.load(input);
        System.out.println(properties.getProperty("name"));
    }
}
