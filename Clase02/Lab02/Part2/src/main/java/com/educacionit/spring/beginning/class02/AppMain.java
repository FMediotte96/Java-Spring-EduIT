/*
 * @(#AppMain.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.educacionit.spring.beginning.class02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

import com.educacionit.spring.beginning.class02.service.EmployeeService;

public class AppMain {

    private static final Logger logger = Logger.getLogger(AppMain.class);

    public AppMain() {
        super();
    }

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

            System.out.println(employeeService.getEmployee().getName());

            employeeService.getEmployee().setName("Raul");

            employeeService.getEmployee().throwException();

            ctx.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}