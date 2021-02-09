import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HeapOOM
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/29
 * @Version V1.0
 **/
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        int i = 0;
        while (true) {
            System.out.println(i++);
            list.add(new OOMObject());
        }
    }
}
