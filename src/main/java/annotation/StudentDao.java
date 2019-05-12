package annotation;

import domain.Student;

/**
 * 学生Dao
 *
 * @author lucky
 * @create 2019/5/12
 * @since 1.0.0
 */
public interface StudentDao {

    public void add(Student stu);
    public void delete(Student stu);
}
