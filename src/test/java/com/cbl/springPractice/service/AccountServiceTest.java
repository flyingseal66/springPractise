package com.cbl.springPractice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/application-context.xml"})
public class AccountServiceTest {

    @Resource
    private IAccountService accountService;

    @Test
    public void test1() {
        accountService.transfer("John", "Mary", 100d);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-context.xml");
        PropertyPlaceholderConfigurer configurer1 = (PropertyPlaceholderConfigurer) context.getBean("placeholderConfigurer");
        System.out.println(configurer1.hashCode());
        PropertyPlaceholderConfigurer configurer2 = (PropertyPlaceholderConfigurer) context.getBean("placeholderConfigurer");
        System.out.println(configurer2.hashCode());
    }
}
