package design.proxy.staticproxy;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 17:56
 */
public class StudentProxy implements Person {
    private Person student;

    public StudentProxy(Person student) {
        if (student.getClass() == Student.class) {
            this.student = student;
        }
    }

    @Override
    public void giveMoney() {
        student.giveMoney();
    }

    @Override
    public void study() {
        student.study();
    }
}