package com.cbl.springPractice.service;

import java.util.List;

/**
 * 转账业务层接口
 */
public interface IAccountService {

    /**
     * @param outAccount 转出账号
     * @param inAccount  转入账号
     * @param money      转账金额
     */
    public void transfer(String outAccount, String inAccount, Double money);
}
