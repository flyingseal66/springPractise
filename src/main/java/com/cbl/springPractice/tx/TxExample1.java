package com.cbl.springPractice.tx;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TxExample1 {


    /**
     * @ Transactional 。它配置了Propagation.REQUIRED 的传播行为，这意味着当别的方法调度
     * 时，如果存在事务就沿用下来，如果不存在事务就开启新的事务，而隔离级别采用默认的
     * 隔离级别，并且设置超时时间为3 秒
     *
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 3)
    public void test1() {
        System.out.println("tx");
    }
}
