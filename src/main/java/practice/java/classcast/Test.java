package practice.java.classcast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("madepeng", "22");
        CardNoOrAcctNoChecker.check(p, Person.class);
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.MIN));
        String s = "{\"pageCount\":1,\"pageSize\":50,\"list\":[{\"integralNum\":10,\"integralStatus\":\"0\",\"typeName\":\"\",\"sourceAppId\":\"P00087A001\",\"typeId\":\"08301\",\"sourcePlatformId\":\"P00087\",\"channelId\":\"01\"}],\"totalCount\":1,\"pageNum\":1}";
        final Object list = JSON.parseObject(s).get("list");
        final JSONArray objects = JSONArray.parseArray(list.toString());
        final Object integralNum = JSON.parseObject(objects.get(0).toString()).get("integralNum");
        System.out.println(integralNum);


        Map<String, String> map = new HashMap<>();
        map.put("k1","valu1");
        map.put("k2", "value2");
        System.out.println(map);
        List<Map<String, String>> lm = new ArrayList<>();
        lm.add(map);
        System.out.println(lm);

        String ss = " size = 1";
        final String replace = ss.replace("=", ":");
        System.out.println(replace);

    }
}
