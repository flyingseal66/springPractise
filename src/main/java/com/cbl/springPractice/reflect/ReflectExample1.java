package com.cbl.springPractice.reflect;


import com.cbl.springPractice.service.impl.AccountServiceImpl;

public class ReflectExample1 {
    AccountServiceImpl object = null;

    public AccountServiceImpl getInstance() {
        try {
            object = (AccountServiceImpl) Class.forName("com.cbl.springPractice.service.impl.AccountServiceImpl").
                    newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e);
        }
        return object;
    }

    public static void main(String[] args) {
        ReflectExample1 example1 = new ReflectExample1();

        AccountServiceImpl impl = example1.getInstance();
        System.out.println(impl.toString());
    }
}
