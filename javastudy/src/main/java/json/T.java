package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName T
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/7
 * @Version V1.0
 **/
public class T {
    public static void main(String[] args) {
        Person p = new Person("fdsf",22);
        System.out.println(JSON.toJSON(p) instanceof Object);
        System.out.println(JSON.toJSON(p) instanceof JSONObject);
        System.out.println(JSON.toJSON(p).getClass().getName());
        System.out.println(JSON.toJSON(p).getClass().equals(JSONObject.class));
        System.out.println(JSON.toJSON(p).getClass()==(JSONObject.class));
        System.out.println(JSON.toJSON(p));
        System.out.println(JSON.toJSONString(p));
        System.out.println(JSON.toJSONString("fdsfds"));


        System.out.println(JSON.isValid(JSON.toJSONString(p)));
        System.out.println(JSON.isValid("fdfds"));
        System.out.println(JSON.isValid("{\"name\":\"fdsf\",\"age\":22}"));
        System.out.println(StringUtils.mid("18813095841",3,4));
        System.out.println(JSONArray.isValid("[{\"name\":\"fdsf\",\"age\":22}]"));
        System.out.println(JSONArray.isValidArray("[{\"name\":\"fdsf\",\"age\":22}]"));
        System.out.println(JSONArray.isValidArray("{\"name\":\"fdsf\",\"age\":22}"));
        System.out.println(JSONArray.isValidObject("{\"name\":\"fdsf\",\"age\":22}"));

        System.out.println(JSON.toJSONString(p).equals(JSON.toJSONString(JSON.toJSONString(p))));
        System.out.println(JSON.toJSONString(p));
        System.out.println(JSON.toJSONString(JSON.toJSONString(p)));
        JSON.parseObject(JSON.toJSONString(p));
        JSON.parseObject(JSON.toJSONString(JSON.toJSONString(p)));
    }
}
