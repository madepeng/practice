package practice.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ListTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/8
 * @Version V1.0
 **/
public class ListTest {
    public static void main(String[] args) {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        JedisPool pool = new JedisPool(config, "172.19.184.12");
        try(Jedis jedis = pool.getResource()) {
            jedis.set("hello", "world");
            System.out.println(jedis.get("hello"));

            /*jedis.rpush("list2", "a", "b", "c", "d");
            jedis.rpush("list3", "a", "b", "c");
            final String rpoplpush = jedis.rpoplpush("list2", "list3");
            System.out.println(rpoplpush);
            System.out.println(jedis.lrange("list2", 0 , -1));
            System.out.println(jedis.lrange("list3", 0 , -1));*/

            jedis.mset("a", "1","b","2","c","3");
            System.out.println(jedis.mget("a","b","c"));
            jedis.set("num", "5");
            System.out.println(jedis.hset("h1", "name", "madepeng"));
            System.out.println(jedis.hset("h1","age","20"));
            System.out.println(jedis.hget("h1","age"));
            System.out.println(jedis.hgetAll("h1"));
            Map<String,String> map = new HashMap<>();
            map.put("d","d");
            map.put("e","e");
            jedis.hmset("h2", map);
            System.out.println(jedis.hmget("h2","d","e"));
        }
    }
}
