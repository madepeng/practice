package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/10
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String filenameStr = "aa/haha.exe";

        Pattern filenameP = Pattern.compile("^.+/(?<filenamePart>.+)$");
        Matcher filenameMatcher = filenameP.matcher(filenameStr);

      /*  System.out.println(filenameMatcher.matches());
        System.out.println(filenameMatcher.end());
        System.out.println(filenameMatcher.find());
//        System.out.println(filenameMatcher.group());
        System.out.println(filenameMatcher.pattern());
        System.out.println(filenameMatcher.toMatchResult());

        String onlyFilename = filenameMatcher.replaceFirst("${filenamePart}");
        System.out.println(onlyFilename);
*/

        /*System.out.println(Pattern.compile("^\\d{2,5}$").matcher("1").matches());
        System.out.println(Pattern.matches("^\\d{2,5}$", "1111111"));
        System.out.println(Pattern.matches("^\\d{2,5}$", "11"));
        System.out.println(Pattern.matches("^\\d{2,5}$", "11"));*/

        /*Matcher matcher = Pattern.compile("(\\d{4})-((\\d{2})-(\\d{2}))").matcher("2017-04-25");
        matcher.matches();
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(4));*/


        /*final String P_NAMED = "(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))";
        final String DATE_STRING = "2017-04-25";

        Pattern pattern = Pattern.compile(P_NAMED);
        Matcher matcher = pattern.matcher(DATE_STRING);
        matcher.find();
        System.out.printf("\n===========使用名称获取=============");
        System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
        System.out.printf("\n matcher.group('year') value:%s", matcher.group("year"));
        System.out.printf("\nmatcher.group('md') value:%s", matcher.group("md"));
        System.out.printf("\nmatcher.group('month') value:%s", matcher.group("month"));
        System.out.printf("\nmatcher.group('date') value:%s", matcher.group("date"));
        matcher.reset();
        System.out.printf("\n===========使用编号获取=============");
        matcher.find();
        System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
        System.out.printf("\nmatcher.group(1) value:%s", matcher.group(1));
        System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
        System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
        System.out.printf("\nmatcher.group(4) value:%s", matcher.group(4));*/


        Pattern pattern = Pattern.compile("(?<text>.*)");
        Matcher matcher = pattern.matcher("abc");
        if(matcher.matches()){
            //输出abc
            System.out.println(matcher.group("text"));
        }

    }
}
