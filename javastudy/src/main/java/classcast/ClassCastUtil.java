package classcast;

/**
 * @ClassName ClassCastUtil
 * @Description: 类型转换工具类，可以提高代码质量
 * @Author madepeng
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ClassCastUtil {
	public static <T> T cast(Object object, Class<T> clazz) {
		if (clazz.isInstance(object)) {
			T cast = (T) object;
			return cast;
		} else {
			throw new ClassCastException("类型转换失败");
		}
	}
}
