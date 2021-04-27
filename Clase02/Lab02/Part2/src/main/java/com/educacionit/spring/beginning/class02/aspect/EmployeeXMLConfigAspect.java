/*
 * @(#EmployeeXMLConfigAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import org.apache.log4j.Logger;

public class EmployeeXMLConfigAspect {

    private static final Logger logger = Logger.getLogger(EmployeeXMLConfigAspect.class);

    public EmployeeXMLConfigAspect() {
        super();
    }

    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        logger.debug("EmployeeXMLConfigAspect:: Before invoking getName() method");
        Object value = null;

        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        logger.debug(String.format("EmployeeXMLConfigAspect:: After invoking getName() method. Return value='%s'", value));
        return value;
    }
}