package practice.num;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @ClassName number
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/4
 * @Version V1.0
 **/
public class number {
    /**
     * @param s
     * @return
     * @Description 判断是否为正整数
     */
    private static boolean isNumeric(String s) {
        Pattern pattern = compile("[0-9]*");
        return pattern.matcher(s).matches();
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("0"));
        System.out.println(isNumeric("-1"));
        System.out.println(isNumeric("0.1"));
    }
}
