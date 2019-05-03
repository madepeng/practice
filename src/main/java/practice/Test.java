package practice;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @author 去
 * @description: 验证java的方法参数是按值调用的
 * 1.基本类型不可改变值
 * 2.引用类型可以改变状态
 * 3.引用类型不可指向新对象
 * @date 2019/5/3 - 10:45
 */
@Data
public class Test {
    @Data
    static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }

    public static void p(Person p){
        if (p == null) p = new Person("init");
        else p.name = "manjianghong";
    }
    public static void t(String integer){

    }

    public static void sawp(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String integer = "8";
        System.out.println(integer);
        t(integer);
        System.out.println(integer);
        int[] a = {1,2};
        sawp(a,0,1);
        System.out.println(JSON.toJSONString(a));
        Person p = new Person("madepeng");
        System.out.println(p);
        p(p);
        System.out.println(p);

        Person p1 = null;
        p(p1);
        System.out.println(p1);
    }
}