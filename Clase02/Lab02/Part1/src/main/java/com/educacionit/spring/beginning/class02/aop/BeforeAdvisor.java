package com.educacionit.spring.beginning.class02.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import org.apache.log4j.Logger;

public class BeforeAdvisor implements MethodBeforeAdvice {

    private static final Logger logger = Logger.getLogger(BeforeAdvisor.class);

    public BeforeAdvisor() {
        super();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.debug("Before business logic !!!");
    }
}