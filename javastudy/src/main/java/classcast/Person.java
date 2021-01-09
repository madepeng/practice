package classcast;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Person
 * @Description: 人类
 * @Author madepeng
 * @Date 2020/3/20
 * @Version V1.0
 **/

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String age;
}
