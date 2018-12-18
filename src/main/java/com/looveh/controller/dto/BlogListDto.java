package com.looveh.controller.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName BlogListDto
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/18 15:59
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class BlogListDto {

    private Integer id;

    private String tag;//标签

    private String title;//标题

    private String imgUrl;//图片路径

    private String detail;//简介

    private String publishDate;//发布时间

    private Integer pageView;//浏览量
}
