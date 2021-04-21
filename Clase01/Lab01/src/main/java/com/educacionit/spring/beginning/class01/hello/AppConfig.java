package com.educacionit.spring.beginning.class01.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public AppConfig() {
        super();
    }

    @Bean(name = "bean")
    public com.educacionit.spring.beginning.class01.hello.Bean getBean() {
        com.educacionit.spring.beginning.class01.hello.Bean b = new com.educacionit.spring.beginning.class01.hello.Bean();
        b.setGreeting("Hola");

        return b;
    }
}