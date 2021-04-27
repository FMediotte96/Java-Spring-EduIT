/*
 * @(#TrackOperation.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.apache.log4j.Logger;

@Aspect
public class TrackOperation {

    private static final Logger logger = Logger.getLogger(TrackOperation.class);

    public TrackOperation() {
        super();
    }


    @After("execution(* com.educacionit.spring.beginning.class02.aspectj.Operation.*(..))")
    public void myadvice(JoinPoint jp) {
        logger.debug("*****************************************************************");
        logger.debug("Method Signature: " + jp.getSignature().getName());
        logger.debug("*****************************************************************");
    }
}