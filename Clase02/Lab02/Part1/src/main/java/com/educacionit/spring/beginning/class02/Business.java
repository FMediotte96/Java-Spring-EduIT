package com.educacionit.spring.beginning.class02;

import org.apache.log4j.Logger;

public class Business {
    private static final Logger logger = Logger.getLogger(Business.class);

    public Business() {
        super();
    }

    public void businessMethod() {
        logger.info("Executin Business rules...");
    }

    @SuppressWarnings("unused")
    public void calculate() throws Exception {
        int i = 1 / 0;
    }
}