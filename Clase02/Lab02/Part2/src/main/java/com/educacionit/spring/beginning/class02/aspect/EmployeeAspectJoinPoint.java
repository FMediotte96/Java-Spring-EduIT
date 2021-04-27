/*
 * @(#EmployeeAspectJoinPoint.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.educacionit.spring.beginning.class02.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.apache.log4j.Logger;

@Aspect
public class EmployeeAspectJoinPoint {

    private static final Logger logger = Logger.getLogger(EmployeeAspectJoinPoint.class);

    public EmployeeAspectJoinPoint() {
        super();
    }

    @Before("execution(public void com.educacionit.spring.beginning.class02.model..set*(*))")
    public void loggingAdvice(JoinPoint joinPoint) {
        logger.debug("Before running loggingAdvice on method=" + joinPoint.toString());
        logger.debug("Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));
    }

    @Before("args(name)")
    public void logStringArguments(String name) {
        logger.debug("String argument passed=" + name);
    }
}