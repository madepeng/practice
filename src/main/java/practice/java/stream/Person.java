package practice.java.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/2/3
 * @Version V1.0
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private String address;
    private String age;
}
