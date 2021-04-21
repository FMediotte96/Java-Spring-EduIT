package com.educacionit.spring.beginning.class01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldXML {

    public HelloWorldXML() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        Bean bean = (Bean) context.getBean("bean");
        bean.sayHello("Raul");

        context = null;
    }
}