package com.cbl.springPractice.aop.aspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class RoleAspectTest {

    @Autowired
    private RoleService roleService;


    @Test
    public void before() {
        Role role = new Role();
        role.setId(22);
        role.setRole_name("role1");
        role.setNote("note");
        roleService.printRole(role);
        role = null;
        roleService.printRole(role);

    }
}