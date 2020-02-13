package practice.algorithm.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 去
 * @description: test
 * @date 2020/2/1 - 14:32
 */
public class Test {
    public static void main(String[] args) {
        AtomicReference<Singleton1> s1 = new AtomicReference<>();
        AtomicReference<Singleton1> s2 = new AtomicReference<>();


        Thread t1 = new Thread(() -> {
            while (true){
                s1.set(Singleton1.getSingleton());
                if (s1.get() != s2.get()){
                    System.out.println("not ==");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while (true){
                s2.set(Singleton1.getSingleton());
                if (s1.get() != s2.get()){
                    System.out.println("not ==");
                }
            }
        });
        t1.start();
        t2.start();
    }
}