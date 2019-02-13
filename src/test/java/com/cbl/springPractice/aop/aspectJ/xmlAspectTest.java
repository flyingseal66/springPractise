package com.cbl.springPractice.aop.aspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aop.xml")
public class xmlAspectTest {
    @Autowired
    private RoleService roleService;


    @Test
    public void before() {
        Role role = new Role();
        role.setId(2000002);
        role.setRole_name("role1");
        role.setNote("note");
        roleService.printRole(role);
        role = null;
        roleService.printRole(role);

    }
}
