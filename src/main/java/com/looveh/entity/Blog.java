package com.looveh.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName Blog
 * @Description 博客
 * @Author Administrator
 * @Date 2018/12/19 14:41
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class Blog {

    private int id;
    private String title;
    private String content;
    private int userId;
    private int readCount;
    private int likeCount;
    private String createTime;
    private String updateTime;
    private String isRecommend;
    private String isShow;
}
