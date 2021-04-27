
package com.educacionit.spring.beginning.class02.aop;

import org.springframework.aop.ThrowsAdvice;

import org.apache.log4j.Logger;

public class ThrowsAdvisor implements ThrowsAdvice {

    private static final Logger logger = Logger.getLogger(ThrowsAdvisor.class);

    public ThrowsAdvisor() {
        super();
    }

    public void afterThrowing(Exception ex) {
        logger.error("Exception !!! ".concat(ex.getMessage()));
    }
}  