package practice.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @ClassName JedisPoolTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/12
 * @Version V1.0
 **/
public class JedisPoolTest {
    public static void main(String[] args) {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxTotal(1);
        JedisPool pool = new JedisPool(config, "172.19.184.152");
        Jedis jedis1 = pool.getResource();
        try(Jedis jedis = pool.getResource()) {
            jedis.set("hello", "world");
            System.out.println(jedis.get("hello"));
        }
    }
}
