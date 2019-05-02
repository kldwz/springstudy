package config;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

/**
 * 使用javabean的方式配置
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */

@Configuration
@Import(value = BookConfiguration.class)
//@ImportResource(value = "beans-another.xml")
public class SpringConfiguration {

    @Bean(name = "stu",autowire = Autowire.BY_TYPE)
    @Scope(value = "singleton")
    public Student student(){
        return new Student(11,"jack",22);
    }
}
