package practice.java.str;

import com.alibaba.fastjson.JSON;

import java.sql.Timestamp;

/**
 * @ClassName Formattest
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/28
 * @Version V1.0
 **/
public class Formattest {
    public static void main(String[] args) {
        System.out.println(String.format("%09d",34333555));
        System.out.println(new Timestamp(System.currentTimeMillis() - 300000000));

        String s1 = "{'name':'madepeng'}";
        String s2 = null;
        System.out.println(JSON.parseObject(s1));
        System.out.println(JSON.parseObject(s1).get("name"));
//        System.out.println(JSON.parseObject(s2).get("name"));
        System.out.println(JSON.parseObject("").get("name"));
    }
}
