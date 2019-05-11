package practice.design.agency.staticImpl;

/**
 * Description：看的时候你要去想这个是如何实现的，如果让你自己实现你能吧java的这些基本知识利用起来，实现这种思想吗
 * 还是只能做这种思想的追随者。
 *
 * @author madepeng on 2019-05-07
 */
public class StudentProxy implements Person{
    Student student;

    public StudentProxy(Person student) {
        if (student.getClass() == Student.class){
            this.student = (Student) student;
        }
    }

    @Override
    public void giveMoney() {
        System.out.println("最近有进步");
        student.giveMoney();
        System.out.println("继续保持");
    }
}
