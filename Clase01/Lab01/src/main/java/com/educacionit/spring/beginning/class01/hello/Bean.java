package com.educacionit.spring.beginning.class01.hello;

public class Bean {

    private String msg = "";

    public void setGreeting(String msg) {
        this.msg = msg;
    }

    public void sayHello(String greeting) {
        System.out.println(this.msg.concat(" ").concat(greeting));
    }
}