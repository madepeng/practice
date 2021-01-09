package design.proxy.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 17:54
 */
@Data
@AllArgsConstructor
public class Student implements Person {
    private String name;
    @Override
    public void giveMoney() {
        System.out.println(this.name + "上交班费50元");
    }

    @Override
    public void study() {
        System.out.println(this.name + "学习了新知识");
    }


}