package practice.character.extend;

import lombok.Data;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/4 - 16:09
 */
@Data
public class Parent {
    private Integer age;
    protected String name;
    public String addr;

    public void m1(){
        System.out.println("p1");
    }

    public static void static_m2(){
        System.out.println("p2");
    }

    public final void test1(){
        System.out.println("final can not be override,but can be extend");
    }

    public final void test1(int n){
        System.out.println("test1 override with param n");
    }
}