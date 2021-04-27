/*
 * @(#EmployeeAnnotationAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
public class EmployeeAnnotationAspect {

    private static final Logger logger = Logger.getLogger(EmployeeAnnotationAspect.class);

    public EmployeeAnnotationAspect() {
        super();
    }

    @Before("@annotation(com.educacionit.spring.beginning.class02.aspect.Loggable)")
    public void myAdvice() {
        logger.debug("Executing myAdvice!!");
    }
}
