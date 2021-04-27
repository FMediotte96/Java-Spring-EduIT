package com.educacionit.spring.beginning.class02.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.apache.log4j.Logger;

public class AroundAdvisor implements MethodInterceptor {

    private static final Logger logger = Logger.getLogger(AroundAdvisor.class);

    public AroundAdvisor() {
        super();
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj;
        logger.debug("Before business logic !!!");
        obj = mi.proceed();
        logger.debug("After business logic !!!");
        return obj;
    }
}