package com.looveh.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName BlogNavigate
 * @Description 博客导航
 * @Author Administrator
 * @Date 2018/12/19 14:50
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class BlogNavigate {

    private int id;
    private String title;
    private int parentId;
}
