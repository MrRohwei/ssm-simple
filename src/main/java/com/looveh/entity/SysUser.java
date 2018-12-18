package com.looveh.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class SysUser {
    private Integer id;

    private String username;

    private String password;

    private String telphone;

    private String realname;

    private String gender;

    private Integer age;

    private String email;

    private String isDisable;

    private Date createtime;

    private Date updatetime;


}