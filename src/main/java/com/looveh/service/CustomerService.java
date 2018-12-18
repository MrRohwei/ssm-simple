package com.looveh.service;

import com.looveh.entity.SysUser;

import java.util.List;

/**
 * @Author Looveh
 * @Date 2018/11/7/007 13:11
 * @Version 1.0
 * @Desc TODO
 **/
public interface CustomerService {

    List<SysUser> getCustomers(SysUser sysUser);

    void addCustomer(SysUser sysUser) throws Exception;

    SysUser login(String username, String password);
}
