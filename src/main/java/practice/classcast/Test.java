package practice.classcast;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("madepeng", "22");
        CardNoOrAcctNoChecker.check(p, Person.class);
    }
}
