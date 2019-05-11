package postprocessor;

import domain.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 用于测试BeanPostProcessor功能
 *
 * @author lucky
 * @create 2019/5/11
 * @since 1.0.0
 */
public class HelloBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after...");

        if (bean instanceof Student){
            bean = (Student)bean;
            ((Student) bean).setName("test:" + ((Student) bean).getName());
        }
        return bean;
    }
}
