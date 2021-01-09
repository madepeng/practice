package seri;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName JsonFormatTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class JsonFormatTest {
    public static void main(String[] args) {
        String s = "\n" +
                "{\n" +
                "\"name\":\"网站\",\n" +
                "\"num\":3,\n" +
                "\"sites\":[ \"Google\", \"Runoob\", \"Taobao\" ]\n" +
                "}\n";
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject);
        Object sites = jsonObject.get("sites");
        System.out.println(sites);
        JSONArray objects = JSON.parseArray(sites.toString());
        System.out.println(objects);
        Object o = objects.get(0);
        System.out.println(o);
    }
}
