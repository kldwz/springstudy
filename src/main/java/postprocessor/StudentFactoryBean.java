package postprocessor;

import domain.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * 学生类FactoryBean实现
 *
 * @author lucky
 * @create 2019/5/12
 * @since 1.0.0
 */
public class StudentFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {

        Student student = new Student();
        student.setAge(22);
        student.setName("jj");
        student.setId(10);

        return student;
    }

    // 对象具体类型
    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    // 是否单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
