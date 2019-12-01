package practice.convert;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.springframework.beans.BeanUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @ClassName T
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class T {
    public static void main(String[] args) {
      /*  Object result;
        result = ConvertUtils.convert("@7##jF*&%#$", Boolean.class);
        System.out.println(result);*/

      /*  ConvertUtilsBean convertUtilsBean = new ConvertUtilsBean();
        convertUtilsBean.register(true, false, 0);
        Object obj;
        obj = convertUtilsBean.convert("@7##jF*&%#$", Boolean.class);
        System.out.println(obj);*/

       /* System.out.println(new Date());
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.out.println(System.currentTimeMillis() - LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.out.println(LocalDateTime.now().toLocalTime());*/
        Date d1 = new Date();
        Date d2 = new Date();
        long l = d1.getTime() - d2.getTime();
        System.out.println(l);
        System.currentTimeMillis();
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.now().plusMinutes(1);
        Duration between = Duration.between(l1, l2);
        System.out.println(between.toMillis());
    }
}
