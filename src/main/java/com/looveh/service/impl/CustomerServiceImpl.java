package com.looveh.service.impl;

import com.looveh.dao.SysUserMapper;
import com.looveh.entity.SysUser;
import com.looveh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Looveh
 * @Date 2018/11/7/007 13:12
 * @Version 1.0
 * @Desc TODO
 **/
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getCustomers(SysUser sysUser) {
        return sysUserMapper.selectByExample(sysUser);
    }

    @Override
    public void addCustomer(SysUser sysUser){
        sysUser.setCreatetime(new Date());
        sysUser.setUpdatetime(new Date());
        sysUser.setGender("保密");
        sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser login(String username, String password) {
        return null;
    }
}
