package practice.redis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/11
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        try(Jedis jedis = new Jedis("172.19.184.152")){
            jedis.set("hello", "madepeng");
            jedis.expire("hello", 10);
            System.out.println(jedis.get("hello"));
            Thread.sleep(10000);
            System.out.println(jedis.get("hello"));
            System.out.println(jedis.incr("counter"));
            jedis.hset("myhash", "f1", "v1");
            jedis.hset("myhash", "f2", "v3");
            System.out.println(jedis.hgetAll("myhash"));
            jedis.rpush("list", "1");
            jedis.rpush("list", "2");
            jedis.rpush("list", "3");
            System.out.println(jedis.lrange("list", 0, -1));
            jedis.sadd("set", "s1");
            jedis.sadd("set", "s2");
            jedis.sadd("set", "s1");
            System.out.println(jedis.smembers("set"));
        }
    }
}
