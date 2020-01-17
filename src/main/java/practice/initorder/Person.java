package practice.initorder;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/17
 * @Version V1.0
 **/
public class Person {
    private int age = 9;
    private String name;
    private Map<String, String> map = ImmutableMap.of("1","1");
    {
        System.out.println("{}:map=" + map + ",age=" +age);
        Map<String, String> map1 = new HashMap<>(map);
        map1.put("2","2");
        map = ImmutableMap.copyOf(map1);
        age = 99;
    }

    public Person() {
        System.out.println("construct:map=" + map + ",age=" +age);
    }
}
