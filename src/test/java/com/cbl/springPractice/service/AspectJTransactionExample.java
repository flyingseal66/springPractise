package com.cbl.springPractice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * spring 声明事务管理方式之二：基于AspectJ的xml方式
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class AspectJTransactionExample {

    /**
     * 注入代理类
     */
    /*@Autowired
    private IAccountService accountService;*/

    @Resource(name = "accountService")
    private IAccountService accountService;

    @Test
    public void test1() {
        accountService.transfer("John", "Mary", 100d);
    }
}
