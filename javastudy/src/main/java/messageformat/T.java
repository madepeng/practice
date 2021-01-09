package messageformat;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @ClassName T
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/6
 * @Version V1.0
 **/
public class T {
    public static void main(String[] args) {
        String string = String.format("name=%s, age=%d", "huhx", 25);
        String message = MessageFormat.format("name={1}, age={0}, {1},{2}", 25, "huhx");
        System.out.println(string);
        System.out.println(message);

        String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";
        Object [] array = new Object[]{"A","B","C","D","E","F","G","H","I",};
        String value = MessageFormat.format(msg, array);
        System.out.println(value);  // 输出：ABCDEFGHI

        String value1 = MessageFormat.format("oh, {0} is 'a' pig", "ZhangSan");
        System.out.println(value1);

        String value2 = MessageFormat.format("oh, {0} is 'a' pig", "ZhangSan");
        System.out.println(value2);

        String format = MessageFormat.format("{0}{1}", 1, 2);// 结果12
        System.out.println(format);
        String format1 = MessageFormat.format("'{0}{1}", 1, 2);// 结果{0}{1}
        System.out.println(format1);
        String format2 = MessageFormat.format("'{0}'-{1}", 1, 2);// 结果{0}-2
        System.out.println(format2);

        String value5 = MessageFormat.format("oh, {0,timeddd} is 'a' pig", new Date());
        System.out.println(value5);
    }
}
