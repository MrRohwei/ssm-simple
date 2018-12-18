package com.looveh.controller;

import com.google.common.collect.Lists;
import com.looveh.controller.dto.BlogListDto;
import com.looveh.resp.BaseResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName IndexController
 * @Description 博客首页
 * @Author Administrator
 * @Date 2018/12/18 15:31
 */
@Api(tags = "首页接口", description = "网站首页接口")
@Controller
@RequestMapping("/index")
public class IndexController {

    @ApiOperation(value = "博客列表")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public BaseResp list(){
        List<BlogListDto> list = Lists.newArrayList();
        for (int i = 1; i <= 5; i++) {
            BlogListDto dto = new BlogListDto();
            dto.setTag("个人博客");
            dto.setId(i);
            dto.setTitle("帝国cms 首页或者列表无图，不使用默认图片的方法");
            dto.setDetail("帝国cms列表页图文展示，或者首页图文展示，如果使用全图和文字，编辑起来比较麻烦，因为每一篇文章，你都得花时间去配图，所以，可有使用以下方法来实现。");
            dto.setPublishDate("2018-12-18");
            dto.setPageView(123);
            dto.setImgUrl("http://localhost:8080/page/images/01.jpg");
            list.add(dto);
        }
        return BaseResp.succ(list);
    }
}
