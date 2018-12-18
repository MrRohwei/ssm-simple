package com.looveh.controller;

import com.looveh.entity.SysUser;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AbstractController
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/18 14:04
 */
public class AbstractController {

    private static final Integer COOKIE_MAX_AGE = 7 * 24 * 60 * 60;//秒

    protected void addCookie(HttpServletRequest req, HttpServletResponse resp, String key, String value) {
        Cookie cookie = new Cookie(key, value);
        cookie.setPath(req.getContextPath() + "/");//cookie路径
        cookie.setMaxAge(COOKIE_MAX_AGE);
        resp.addCookie(cookie);
    }

    protected Map<String,Object> getCookie(HttpServletRequest req, String username){
        Cookie[] cookies = req.getCookies();
        Map<String,Object> map = new HashMap<>();
        if(null != cookies){
            for (Cookie cookie : cookies) {
                if(username.equals(cookie.getName())) {
                    String password = cookie.getValue();
                    map.put("username", username);
                    map.put("password", password);
                    return map;
                }
            }
        }
        return null;
    }
}
