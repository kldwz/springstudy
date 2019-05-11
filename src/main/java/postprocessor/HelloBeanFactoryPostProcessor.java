package postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 测试BeanFactoryPostProcessor
 *
 * @author lucky
 * @create 2019/5/11
 * @since 1.0.0
 */
public class HelloBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor.postProcessBeanFactory()");

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanName: beanDefinitionNames) {
            if ("stu".equals(beanName)){
                BeanDefinition student = beanFactory.getBeanDefinition(beanName);
                MutablePropertyValues propertyValues = student.getPropertyValues();

                // 修改scope
                student.setScope("prototype");

                // 修改属性
                /*if (propertyValues.contains("name")){
                    propertyValues.addPropertyValue("name","lucy");

                }*/
            }
        }
    }
}
