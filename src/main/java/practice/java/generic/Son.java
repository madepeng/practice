package practice.java.generic;

import lombok.Data;

/**
 * @ClassName Son
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/23 11:04
 * @Version 1.0
 */
@Data
public class Son extends Parent {
    public Son(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.getName();
    }
}