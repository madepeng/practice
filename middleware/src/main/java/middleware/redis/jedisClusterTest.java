package middleware.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 去
 * @description: TODO
 * @date 2020/1/1 - 16:37
 */
public class jedisClusterTest {
    public static void main(String[] args) {
        Set<HostAndPort> jedisClusterNodes = new HashSet<>();
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6379));
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6380));
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6381));
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6382));
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6383));
        jedisClusterNodes.add(new HostAndPort("192.168.43.232" ,6384));

        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes, 1000, 1000, 5, poolConfig);
        jedisCluster.set("hello", "caonima");
        System.out.printf(jedisCluster.get("hello"));
    }
}