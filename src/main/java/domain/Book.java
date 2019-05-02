package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 书籍类信息
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 8385108608138140608L;
    private int id;
    private String bookName;
    private String desc;
    private String author;

    public void init(){
        System.out.println("book init...");
    }

    public void destory(){
        System.out.println("book destory...");
    }
}
