package pingtai;

import lombok.Data;

/**
 * @ClassName Plus
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/3
 * @Version V1.0
 **/
@Data
public class Plus {
    private int sum;

    public int inc() {
        return sum++;
    }
}
