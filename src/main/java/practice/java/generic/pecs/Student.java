package practice.java.generic.pecs;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/28
 * @Version V1.0
 **/
@Data
@NoArgsConstructor
public class Student extends Person {
    public Student(String susan, int i) {
        super(susan,i);
    }
}
