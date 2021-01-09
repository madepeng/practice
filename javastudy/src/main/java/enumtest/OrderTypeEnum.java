package enumtest;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName OrderTypeEnum
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/5/18
 * @Version V1.0
 **/
@Getter
@AllArgsConstructor
public enum OrderTypeEnum {
    Consume(1,"dfdsf"),
    refund(2,"fdf");

    private Integer code;
    private String desc;
}