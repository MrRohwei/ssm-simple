package com.looveh.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName AccessRecord
 * @Description 访问记录
 * @Author Administrator
 * @Date 2018/12/19 14:47
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class AccessRecord {

    private int id;
    private String address;//ip地址
    private int blogId;//访问的博客
    private String createTime;//访问时间
}
