package com.cbl.springPractice.dao;

import org.apache.ibatis.annotations.Param;

/**
 * 转账案例dao层接口
 */
public interface AccountDao {

    /**
     * @param accountName
     * @param money
     */
    public void minusMoney(@Param("accountName") String accountName, @Param("money") Double money);

    /**
     *
     * @param accountName
     * @param money
     */
    public void plusMoney(@Param("accountName") String accountName, @Param("money") Double money);
}
