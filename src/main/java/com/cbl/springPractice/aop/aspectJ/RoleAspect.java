package com.cbl.springPractice.aop.aspectJ;

import org.aspectj.lang.annotation.*;
import org.springframework.transaction.annotation.Transactional;

@Aspect
public class RoleAspect {



    @Before("execution(* com.cbl.springPractice.aop.aspectJ.RoleServiceimpl.printRole(..))")
    public void before() {
        System.out.println("before......");
    }

    @After("execution(* com.cbl.springPractice.aop.aspectJ.RoleServiceimpl.printRole(..))")
    public void after() {
        System.out.println("after......");
    }


    @AfterReturning("execution(* com.cbl.springPractice.aop.aspectJ.RoleServiceimpl.printRole(..))")
    public void afterReturning() {
        System.out.println("afterReturning()......");
    }

    @AfterThrowing("execution(* com.cbl.springPractice.aop.aspectJ.RoleServiceimpl.printRole(..))")
    public void afterThrowing() {
        System.out.println("after throwing");
    }

}
