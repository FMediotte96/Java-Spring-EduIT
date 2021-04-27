/*
 * @(#AppOperation.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

import com.educacionit.spring.beginning.class02.aspectj.Operation;

public class AppOperation {

    private static final Logger logger = Logger.getLogger(AppOperation.class);

    public AppOperation() {
        super();
    }


    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Operation e = context.getBean("operationBean", Operation.class);

            e.notification();
            e.calculate();
            context = null;

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}