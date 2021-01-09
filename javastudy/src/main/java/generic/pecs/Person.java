package generic.pecs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/7/28
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
