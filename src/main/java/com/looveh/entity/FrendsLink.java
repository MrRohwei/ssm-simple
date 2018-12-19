package com.looveh.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName FrendsLink
 * @Description 友链
 * @Author Administrator
 * @Date 2018/12/19 14:52
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class FrendsLink {

    private int id;
    private String name;
    private String link;
    private String createTime;
}
