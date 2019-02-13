package com.cbl.springPractice.reflect.proxy;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
