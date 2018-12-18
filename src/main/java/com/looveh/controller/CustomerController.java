package com.looveh.controller;

import com.looveh.constants.ResponseMessageEnum;
import com.looveh.entity.Customer;
import com.looveh.resp.BaseResp;
import com.looveh.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Looveh
 * @Date 2018/11/7/007 13:14
 * @Version 1.0
 * @Desc TODO
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController {
//    private Logger log =

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/register")
    @ResponseBody
    public BaseResp register(Customer customer){
//        Customer c = new Customer();
//        c.setUsername("looveh");
//        c.setPassword("111111");
//        c.setTelphone("13162217951");
//        c.setRealname("卢威");
//        c.setGender("保密");
//        c.setAge(23);
//        c.setEmail("965556351@qq.com");
//        c.setCreatetime(new Date());
//        c.setUpdatetime(new Date());
        Customer c = new Customer();
        c.setEmail(customer.getEmail());
        //邮箱查询是否已经注册
        List<Customer> customers = customerService.getCustomers(c);
        if(customers != null && customers.size() > 0){
            return BaseResp.fail(ResponseMessageEnum.EMAIL_HAS_BEAN_BIND);
        }
        try {
            customerService.addCustomer(customer);
            //发送邮件  todo
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResp.fail(ResponseMessageEnum.REGISTER_FAIL);
        }
        if(null == customer.getId()){
            return BaseResp.fail(ResponseMessageEnum.REGISTER_FAIL);
        }
        return BaseResp.succ(customer);
    }
}
