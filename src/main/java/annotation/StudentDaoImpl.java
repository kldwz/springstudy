package annotation;

import domain.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * 学生DAO实现类
 *
 * @author lucky
 * @create 2019/5/12
 * @since 1.0.0
 */

@Repository("stuDao")
@Primary
public class StudentDaoImpl implements StudentDao {

    @Override
    public void add(Student stu) {
        System.out.println("insert student..." + stu);
    }

    @Override
    public void delete(Student stu) {
        System.out.println("delete student..." + stu);
    }
}
