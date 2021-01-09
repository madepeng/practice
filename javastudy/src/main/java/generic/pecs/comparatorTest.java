package generic.pecs;

import java.util.Comparator;

/**
 * @ClassName comparatorTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/28
 * @Version V1.0
 **/
public class comparatorTest implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
