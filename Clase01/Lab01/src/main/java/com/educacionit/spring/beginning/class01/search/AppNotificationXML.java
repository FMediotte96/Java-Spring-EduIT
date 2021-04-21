package com.educacionit.spring.beginning.class01.search;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

public class AppNotificationXML {

    private static final Logger logger = Logger.getLogger(AppNotificationXML.class);

    public AppNotificationXML() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Database database = context.getBean("database", Database.class);
        List<String> list = database.findByIdMoreThan(45);
        list.forEach(logger::info);

        List<String> list2 = database.findByIdMoreThan();
        list2.forEach(logger::info);

        context = null;
    }
}