package com.educacionit.spring.beginning.class02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBusinessException {

    public AppBusinessException() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextException.xml");

            Business obj = context.getBean("proxy", Business.class);
            obj.calculate();

            context = null;

        } catch (Exception e) {
        }
    }
}