package com.looveh.service.impl;

import com.looveh.dao.CustomerMapper;
import com.looveh.entity.Customer;
import com.looveh.service.CustomerService;
import org.apache.commons.lang3.StringUtils;
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
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomers(Customer customer) {
        return customerMapper.selectByExample(customer);
    }

    @Override
    public void addCustomer(Customer customer){
        customer.setCreatetime(new Date());
        customer.setUpdatetime(new Date());
        customer.setGender("保密");
        customerMapper.insert(customer);
    }
}
