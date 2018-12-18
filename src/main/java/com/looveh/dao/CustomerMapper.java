package com.looveh.dao;

import com.looveh.entity.Customer;

import java.util.List;

public interface CustomerMapper {
//    long countByExample(CustomerExample example);

//    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(Customer record);

    Customer selectByPrimaryKey(Integer id);

//    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

//    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}