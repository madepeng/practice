package practice.design.agency.dynamicImpl;

/**
 * Description：
 *
 * @author madepeng on 2019-05-10
 */
public class Student implements Person{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name" + "上交班费50元");
    }
}
