package domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

/**
 * 生命周期管理测试Bean
 *
 * @author lucky
 * @create 2019/5/3
 * @since 1.0.0
 */
public class LifeCycleBean implements Serializable , InitializingBean, DisposableBean {

    private static final long serialVersionUID = 2731651017595722776L;

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init...");
    }

    public void xmlDestroy() {
        System.out.println("xml destroy...");
    }

    public void xmlInit() {
        System.out.println("xml init...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("annotation init ...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("annotation destroy...");
    }


}
