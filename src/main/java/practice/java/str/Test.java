package practice.java.str;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName Test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/22 10:25
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String s = "  dsdsf   ";
        System.out.println(s.trim());
        System.out.println(StringUtils.trim(s));
        System.out.println(StringUtils.trimToEmpty(s));
        System.out.println(StringUtils.trimToNull(s));
        for (int i = 0; i < 5; i++) {
            System.out.println("i:"+i);
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    throw new Exception("e");
                }
                System.out.println("j:"+j);
            }
        }
    }
}