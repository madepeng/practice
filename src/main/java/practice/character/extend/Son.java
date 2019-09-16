package practice.character.extend;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/4 - 16:55
 */
public class Son extends Parent {

    public static void static_m2(){
        System.out.println("son p2");
    }

    @Override
    public void m1() {
        System.out.println("son p1");
    }

    public void fieldGet(){
        System.out.println(getAge() + name +addr);
    }

}