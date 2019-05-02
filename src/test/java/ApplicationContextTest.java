import config.SpringConfiguration;
import domain.Book;
import domain.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器测试类
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */
public class ApplicationContextTest {

    @Test
    public void testXml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book);
        Student studentNoValue = (Student) applicationContext.getBean("stuName");

        applicationContext.close();

        /*Student studentNoValue2 = (Student) applicationContext.getBean("stuName");

        System.out.println(studentNoValue == studentNoValue2);

        Student studentFullValue = (Student) applicationContext.getBean("studentFullValue");
        System.out.println(studentNoValue);
        System.out.println(studentFullValue);


        Student studentConstruct1 = (Student) applicationContext.getBean("studentConstruct");
        Student studentConstruct2 = (Student) applicationContext.getBean("studentConstruct2");
        Student studentConstruct3 = (Student) applicationContext.getBean("studentConstruct3");
        System.out.println(studentConstruct1);
        System.out.println(studentConstruct2);
        System.out.println(studentConstruct3);

        Book bookChinese = (Book) applicationContext.getBean("bookChinese");
        System.out.println(bookChinese);*/
    }

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Student student = (Student) applicationContext.getBean("student");// byName
        System.out.println(student);
//        Student student = applicationContext.getBean(Student.class);// byType
//        System.out.println(student);

        Book book = (Book) applicationContext.getBean("book");
        Book book1 = (Book) applicationContext.getBean("book");
        System.out.println(book == book1);// false
        System.out.println(book);
    }
}
