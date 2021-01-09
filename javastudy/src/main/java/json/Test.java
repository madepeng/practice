package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/29
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String s = "{\n" +
                "\t\"QFINPath\": {\n" +
                "\t\t\"prefix\": \"/opt/ccs/ccs09/ftsdata/receivefile/ccs02/ccs0036001/\",\n" +
                "\t\t\"suffix\": \"_QFIN_loan_trans.csv\"\n" +
                "\t},\n" +
                "\t\"QFINMIPath\": {\n" +
                "\t\t\"prefix\": \"/opt/ccs/ccs09/ftsdata/receivefile/ccs02/ccs00qf006/\",\n" +
                "\t\t\"suffix\": \"_QFINMI_loan_trans.csv\"\n" +
                "\t},\n" +
                "\t\"QFINZYXJDPath\": {\n" +
                "\t\t\"prefix\": \"/opt/ccs/ccs09/ftsdata/receivefile/ccs02/ccs00qfzy1/\",\n" +
                "\t\t\"suffix\": \"_QFINZYXJD_loan_trans.csv\"\n" +
                "\t}\n" +
                "}";

        JSONObject jsonObject = JSON.parseObject(s);
        Set<String> strings = jsonObject.keySet();
        for (String string : strings) {
            System.out.println(string);
            JSONObject jsonObject1 = jsonObject.getJSONObject(string);
            String prefix = jsonObject1.getString("prefix");
            String suffix = jsonObject1.getString("suffix");
            System.out.println(prefix);
            System.out.println(suffix);
        }
    }
}
