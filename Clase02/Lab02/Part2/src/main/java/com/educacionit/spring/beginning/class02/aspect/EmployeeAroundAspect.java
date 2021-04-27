/*
 * @(#EmployeeAroundAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


import org.apache.log4j.Logger;

@Aspect
public class EmployeeAroundAspect {

    private static final Logger logger = Logger.getLogger(EmployeeAroundAspect.class);

    public EmployeeAroundAspect() {
        super();
    }


    @Around("execution(* com.educacionit.spring.beginning.class02.model.Employee.getName())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        logger.debug("Before invoking getName() method");

        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.debug("After invoking getName() method. Return value=" + value);

        return value;
    }
}