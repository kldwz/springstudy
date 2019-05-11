package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生类
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -2088281526481179972L;
    private int id;
    private String name;
    private int age;

    public void init(){
        System.out.println("student init...");
    }

    public void destroy(){
        System.out.println("student destroy...");
    }


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("allArgsConstructor...");
    }

    public Student() {
        System.out.println("noArgsConstructor...");
    }
}
