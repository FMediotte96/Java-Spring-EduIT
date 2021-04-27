package com.educacionit.spring.beginning.class02.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import org.apache.log4j.Logger;

public class AfterAdvisor implements AfterReturningAdvice {

    private static final Logger logger = Logger.getLogger(AfterAdvisor.class);

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.debug("After business logic !!!");
    }

}