package domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证factory-method的工厂类
 *
 * @author lucky
 * @create 2019/5/2
 * @since 1.0.0
 */
public class BookFactory {

    private static Map<String,Book> bookMap = new HashMap<String,Book>();

    static {
        bookMap.put("Chinese",new Book(1,"语文","语文书","jack"));
        bookMap.put("Math",new Book(2,"数学","数学书","lucy"));
        bookMap.put("English",new Book(3,"英语","英语书","lili"));
    }

    public static Book getBook(String name){
        return bookMap.get(name);
    }
}
