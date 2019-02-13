package com.cbl.springPractice.aop.aspectJ;


/**
 * 切点， printRole
 */
public class RoleServiceimpl implements RoleService {

    @Override
    public void printRole (Role role) {
        System.out.println("{id: "+ role.getId() + ", role_name: " +
                role.getRole_name() + ", note" + role.getNote());;
    }
}
