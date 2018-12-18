package com.looveh.controller;

import com.looveh.constants.ResponseMessageEnum;
import com.looveh.entity.SysUser;
import com.looveh.resp.BaseResp;
import com.looveh.service.CustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author Looveh
 * @Date 2018/11/7/007 13:14
 * @Version 1.0
 * @Desc 后台登录
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController extends AbstractController {
//    private Logger log =

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public BaseResp login(String username, String password, HttpServletRequest request, HttpServletResponse response){
        if(StringUtils.isBlank(username)){
            return BaseResp.fail("用户名不能为空");
        }
        if(StringUtils.isBlank(password)){
            return BaseResp.fail("密码不能为空");
        }
        SysUser sysUser = customerService.login(username,password);
        if (sysUser == null || "1".equals(sysUser.getIsDisable())) {
            return BaseResp.fail(ResponseMessageEnum.NOT_EXIST_OR_DISABLED);
        }
        addCookie(request,response,username,password);

        return null;
    }


}
