package practice.character.extend;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/4 - 16:56
 */
public class StaticNotOver {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();
        p1.static_m2();
        System.out.println();

        Parent p2 = new Son();
        p2.m1();
        p2.static_m2();
        System.out.println();

        Son p3 = new Son();
        p3.m1();
        p3.static_m2();
        p3.test1();
    }
}