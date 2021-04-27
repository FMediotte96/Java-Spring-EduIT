/*
 * @(#Operation.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */
package com.educacionit.spring.beginning.class02.aspectj;

import org.apache.log4j.Logger;

public class Operation {

    private static final Logger logger = Logger.getLogger(Operation.class);

    public Operation() {
        super();
    }

    public void notification() {
        logger.info("Sending some notifications...");
    }

    public int calculate() {
        logger.info("Executing some calculate...");
        return 2;
    }

    public int convert() {
        logger.info("Executing some checking...");
        return 3;
    }
}
