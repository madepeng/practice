package practice.design.agency.staticImpl;

import lombok.Data;

/**
 * Description：
 *
 * @author madepeng on 2019-05-07
 */
@Data
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
