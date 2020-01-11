package practice.apollo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @ClassName PersonBean
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/1/10
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
public class PersonBean {
    private String name;
    private String age;

    private List<String> address;

    private Son son;
}
