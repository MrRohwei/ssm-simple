package com.looveh.controller;

import com.looveh.resp.BaseResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Looveh
 * @Date 2018/11/21/021 21:51
 * @Version 1.0
 * @Desc 博客Controller
 **/
@Controller
//@RequestMapping("")
public class BlogController {

    @RequestMapping("/index")
    public String toHomePage(){
        return "index";
    }
}
