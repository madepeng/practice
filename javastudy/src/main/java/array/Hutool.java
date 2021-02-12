package array;

import cn.hutool.core.util.ArrayUtil;

/**
 * @ClassName Hutool
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/2/12
 * @Version V1.0
 **/
public class Hutool {
    public static void main(String[] args) {
        Object[] objects= {null};
        System.out.println(ArrayUtil.isAllNull(objects));
    }
}
