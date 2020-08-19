package practice.camunda;

import org.springframework.beans.BeanUtils;
import practice.java.reflect.Person;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/15 18:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person p = new Person("ma");
        PropertyDescriptor[] descriptors = BeanUtils.getPropertyDescriptors(Person.class);
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println(descriptor.getReadMethod().getName());
            Object o = descriptor.getReadMethod().invoke(p);
            System.out.println(o);

           /* System.out.println(descriptor.getWriteMethod().getName());
            Object o1 = descriptor.getWriteMethod().invoke(p);
            System.out.println(o1);*/

            System.out.println(descriptor.getPropertyType().getName());
            System.out.println();
        }
    }
}