package practice.str;

/**
 * @ClassName T1
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/13
 * @Version V1.0
 **/
public class T1 {
    public static void main(String[] args) {
        byte  b2[] = {0x01};
        String str2 = new String(b2);

        byte  b1[] = {0x02};
        String str1 = new String(b1);

        System.out.println("aaa"+str2+"aaa");
        System.out.println("aaa"+str1+"aaa");

        String line = "a,b,c";
        String[] record = line.split(",");
    }
}
