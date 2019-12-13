package practice.seri;

import com.alibaba.fastjson.JSON;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

/**
 * @ClassName SerialTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class SerialTest {
    public static void main(String[] args) {
        Persion p = new Persion(1L, "陈俊生", 88, LocalDateTime.now());
        System.out.println("person Seria:" + p);
        System.out.println(JSON.toJSONString(p));
        try {
            FileOutputStream fos = new FileOutputStream("Persion.ggg");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
