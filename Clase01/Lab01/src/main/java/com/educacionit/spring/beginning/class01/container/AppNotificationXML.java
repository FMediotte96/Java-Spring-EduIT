package com.educacionit.spring.beginning.class01.container;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppNotificationXML {

    public AppNotificationXML() {
        super();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");

        networkMng.readData();
        context.close();
    }
}