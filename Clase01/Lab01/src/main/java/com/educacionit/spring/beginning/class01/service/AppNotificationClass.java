package com.educacionit.spring.beginning.class01.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppNotificationClass {

    public AppNotificationClass() {
        super();
    }


    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IInventoryService inventoryService = context.getBean("inventoryServiceBean", IInventoryService.class);
        inventoryService.add("MacBook Air");

        context = null;
    }
}