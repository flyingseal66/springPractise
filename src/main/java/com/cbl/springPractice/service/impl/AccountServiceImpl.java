package com.cbl.springPractice.service.impl;

import com.cbl.springPractice.dao.AccountDao;
import com.cbl.springPractice.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 转账业务层实现类
 *
 * @Transactional注解中的属性
 * propagation: 事务的传播行为
 * isolation: 事务的隔离级别
 * readOnly: 是否只读
 * rockBackFor: 发生哪些异常回滚
 *
 *
 */
@Service("accountService")
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
public class AccountServiceImpl implements IAccountService {
    //注入
    @Autowired
    private AccountDao accountDao;

    /**
     * @param outAccount 转出账号
     * @param inAccount  转入账号
     * @param money      转账金额
     */
    public void transfer(String outAccount, String inAccount, Double money) {
        accountDao.minusMoney(outAccount, money);
//        int a = 1/0;
        accountDao.plusMoney(inAccount, money);
    }

}
