package json;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/7
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
