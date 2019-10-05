package practice.generic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Parent
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/23 11:04
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Parent {
    private String name;

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
}