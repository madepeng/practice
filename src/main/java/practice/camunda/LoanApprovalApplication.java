package practice.camunda;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.springframework.beans.BeanUtils;
import practice.reflect.Person;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName LoanApprovalApplication
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/12 16:37
 * @Version 1.0
 */
@ProcessApplication("Loan Approval App")
public class LoanApprovalApplication extends ServletProcessApplication {
    // empty implementation
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person p = new Person("ma");
        PropertyDescriptor[] descriptors = BeanUtils.getPropertyDescriptors(Person.class);
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println(descriptor.getReadMethod().getName());
            Object o = descriptor.getReadMethod().invoke(p);

            System.out.println(descriptor.getPropertyType().getName());;
        }
    }
}