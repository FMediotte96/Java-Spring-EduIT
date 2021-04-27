package com.educacionit.spring.beginning.class02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBusinessAfter {

    public AppBusinessAfter() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAfter.xml");

        Business obj = context.getBean("proxy", Business.class);
        obj.businessMethod();
        context = null;
    }
}