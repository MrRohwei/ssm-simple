package com.looveh.service;

import com.looveh.entity.Customer;

import java.util.List;

/**
 * @Author Looveh
 * @Date 2018/11/7/007 13:11
 * @Version 1.0
 * @Desc TODO
 **/
public interface CustomerService {

    List<Customer> getCustomers(Customer customer);

    void addCustomer(Customer customer) throws Exception;
}
