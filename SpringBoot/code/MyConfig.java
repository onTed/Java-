package com.han.yaml.config;

import com.han.yaml.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明当前类是一个配置类，用来替代之前的spring的配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 *
 */
@Configuration
public class MyConfig {

    //@Bean将方法的返回值添加到容器中，容器中这个组件的默认id就是注解方法名
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
