package com.educacionit.spring.beginning.class01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldClass {

    public HelloWorldClass() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Bean bean = (Bean) context.getBean("bean");
        bean.sayHello("Roman");

        context = null;
    }
}