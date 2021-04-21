package com.educacionit.spring.beginning.class01.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppNotificationXML {

    public AppNotificationXML() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        IInventoryService inventoryService = context.getBean("inventoryServiceBean", IInventoryService.class);
        inventoryService.add("MacBook Air");

        context = null;
    }
}