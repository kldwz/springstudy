package config;

import domain.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Book配置类
 *
 * @author lucky
 * @create 2019/5/1
 * @since 1.0.0
 */
@Configuration
public class BookConfiguration {

    @Bean(initMethod = "init",destroyMethod = "destory")
    @Scope(value = "prototype")
    public Book book(){
        return new Book();
    }
}
