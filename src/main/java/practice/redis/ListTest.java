package practice.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

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

            jedis.rpush("list2", "a", "b", "c", "d");
            jedis.rpush("list3", "a", "b", "c");
            final String rpoplpush = jedis.rpoplpush("list2", "list3");
            System.out.println(rpoplpush);
            System.out.println(jedis.lrange("list2", 0 , -1));
            System.out.println(jedis.lrange("list3", 0 , -1));
        }
    }
}
