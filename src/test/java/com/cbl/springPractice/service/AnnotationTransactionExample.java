package com.cbl.springPractice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 基于注解的spring事务声明管理方式
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class AnnotationTransactionExample {

    @Resource(name = "accountService")
    private IAccountService accountService;

    @Test
    public void test1() {
        accountService.transfer("John", "Mary", 100d);
    }
}
