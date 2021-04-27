/*
 * @(#EmployeeAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {

    private static final Logger logger = Logger.getLogger(EmployeeAspect.class);

    public EmployeeAspect() {
        super();
    }

    @Before("execution (public String getName())")
    public void getNameAdvice() {
        logger.debug("Executing Advice on getName()");
    }

    @Before("execution (* com.educacionit.spring.beginning.class02.service.*.get*())")
    public void getAllAdvice() {
        logger.debug("Service method getter called");
    }
}