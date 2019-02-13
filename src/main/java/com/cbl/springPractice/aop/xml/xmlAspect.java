package com.cbl.springPractice.aop.xml;


public class xmlAspect {

    public void before() {
        System.out.println("before......");
    }

    public void after() {
        System.out.println("after......");
    }


    public void afterReturning() {
        System.out.println("afterReturning()......");
    }

    public void afterThrowing() {
        System.out.println("after throwing");
    }
}
