package exception;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/12 - 17:43
 */
public class Test1 {
    public static void main(String[] args) {
        g();
    }

    public static void g(){
        System.out.println("t start");
        try {
            t();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("t end");
    }

    public static void t(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String s = "";
        System.out.println(NumberUtils.isParsable(s));
        System.out.println(NumberUtils.isParsable("1"));
        System.out.println(NumberUtils.isParsable("1.1"));
        System.out.println(NumberUtils.isParsable("0.1"));
        System.out.println(NumberUtils.isParsable("000001"));
        System.out.println(NumberUtils.isParsable("00000100000"));
        System.out.println(isNumeric("9"));
        System.out.println(isNumeric("-9"));
        System.out.println(Integer.valueOf("000001"));
        System.out.println();
        System.out.println();
        System.out.println(NumberUtils.isParsable("1111111111111111111111111111"));
    }

    // 判断是否为正整数
    private static boolean isNumeric(String s){
        Pattern pattern = compile("[0-9]*");
        return pattern.matcher(s).matches();
    }
}