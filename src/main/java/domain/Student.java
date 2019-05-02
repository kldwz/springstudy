package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生类
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -2088281526481179972L;
    private int id;
    private String name;
    private int age;
}
