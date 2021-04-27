/*
 * @(#EmployeeAspectPointcut.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.apache.log4j.Logger;

@Aspect
public class EmployeeAspectPointcut {

    private static final Logger logger = Logger.getLogger(EmployeeAspectPointcut.class);

    public EmployeeAspectPointcut() {
        super();
    }

    @Before("getNamePointcut()")
    public void loggingAdvice() {

        logger.debug("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice() {
        logger.debug("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut() {
    }

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice() {
        logger.debug("Before executing service method");
    }

    @Pointcut("within (com.educacionit.spring.beginning.class02.service.*)")
    public void allMethodsPointcut() {
    }
}
