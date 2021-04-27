/*
 * @(#EmployeeAfterAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAfterAspect {

    private static final Logger logger = Logger.getLogger(EmployeeAfterAspect.class);

    public EmployeeAfterAspect() {
        super();
    }

    @After("args(name)")
    public void logStringArguments(String name) {
        logger.debug("Running After Advice. String argument passed=" + name);
    }

    @AfterThrowing("within(com.educacionit.spring.beginning.class02.model.Employee)")
    public void logExceptions(JoinPoint joinPoint) {
        logger.debug("Exception thrown in Employee Method=" + joinPoint.toString());
    }

    @AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
    public void getNameReturningAdvice(String returnString) {
        logger.debug("getNameReturningAdvice executed. Returned String=" + returnString);
    }
}
