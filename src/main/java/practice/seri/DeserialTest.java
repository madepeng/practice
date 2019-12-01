package practice.seri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName DeserialTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class DeserialTest {
    public static void main(String[] args) {
        Persion p;
        try {
            FileInputStream fis = new FileInputStream("Persion.ggg");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Persion) ois.readObject();
            ois.close();
            System.out.println(p.toString());
            System.out.println(p.userName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
