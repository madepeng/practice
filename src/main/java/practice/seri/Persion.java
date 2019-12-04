package practice.seri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ClassName Persion
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/21
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persion implements Serializable {
    private static final long serialVersionUID = 1L;
    public Long id;
    public String name;
    public Integer age;
    public LocalDateTime date;
    public final String userName = "ddd";

}