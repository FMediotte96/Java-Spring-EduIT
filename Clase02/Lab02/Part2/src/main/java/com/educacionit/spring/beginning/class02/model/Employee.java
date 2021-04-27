/*
 * @(#Employee.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.educacionit.spring.beginning.class02.model;

import com.educacionit.spring.beginning.class02.aspect.Loggable;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String nm) {
        this.name = nm;
    }

    public void throwException() {
        throw new RuntimeException("Mock Exception");
    }
}