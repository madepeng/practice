package practice.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName MyClass
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/18 20:14
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyClass<T> implements MyInterface<Integer>{
    private T first;
    private T second;

    public void p(){
        System.out.println("first:" + first + ",second:" + second);
    }

    public void p1(T[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public <T> void p2(T[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public <T extends Comparable> void p3(T b){
        System.out.println(b);
    }

    @Override
    public void pp(Integer integer) {
        System.out.println(integer);
    }

    public <T> void ppp(List<T> list){
        System.out.println(list);
    }
}