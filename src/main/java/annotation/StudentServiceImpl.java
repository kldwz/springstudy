package annotation;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生Service实现类
 *
 * @author lucky
 * @create 2019/5/12
 * @since 1.0.0
 */
//@Service(value = "stuService")
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
//    @Qualifier("stuDao1")
    private StudentDao studentDao;

    @Override
    public void add(Student stu) {
        studentDao.add(stu);
    }

    @Override
    public void delete(Student stu) {
        studentDao.delete(stu);
    }
}
