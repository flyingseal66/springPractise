package com.cbl.springPractice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 基于TransactionProxyFactoryBean的事务管理方式，测试该实现，需要先打开其在spring-service中的注释
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class DeclarativeTransactionExample1 {

    /**
     * 注入代理类
     */
    /*@Autowired
    private IAccountService accountService;*/

    //@Resource(name = "accountServiceProxy")
    private IAccountService accountService;

    @Test
    public void test1() {
        accountService.transfer("John", "Mary", 100d);
    }
}
