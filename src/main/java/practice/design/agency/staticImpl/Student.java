package practice.design.agency.staticImpl;

/**
 * Description：
 *
 * @author madepeng on 2019-05-07
 */
public class Student implements Person{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
