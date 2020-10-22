package practice.java.delimiter;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/20
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        byte[] b = {0x01};
        byte[] c = {0x02};
        String s = "123" + new String(b) + "456" + new String(c) + "7 8 9";
        System.out.println(s);
        System.out.println(s.split(" ")[0]);
        System.out.println(s.split(" ")[1]);
        System.out.println(s.split(" ")[2]);
    
        System.out.println(103 / 10);
        System.out.println(103 % 10);
    }
}
