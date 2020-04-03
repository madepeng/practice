package practice.java.finalTest.fieldTest;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/4/3
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        final int a = 9;
//        a = 11;

        final Human human = new Human("ma", "21");
        Human human1 = new Human("ma1", "211");

//        human = human1;
        System.out.println(human);
        human.setName("de");
        System.out.println(human);
    }
}
