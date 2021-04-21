package com.educacionit.spring.beginning.class01.collection;

import java.util.List;
import java.util.Set;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");

        MyCollections myCollections = context.getBean("myCollectionsBean", MyCollections.class);
        List<String> list = myCollections.getList();

        list.forEach(logger::info);

        Set<String> list2 = myCollections.getSet();

        list2.forEach(logger::info);

        context = null;
    }
}