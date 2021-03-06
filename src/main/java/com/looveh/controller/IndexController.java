package com.looveh.controller;

import com.looveh.entity.Blog;
import com.looveh.resp.BaseResp;
import com.looveh.service.BlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private BlogService blogService;

    @ApiOperation(value = "博客列表")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public BaseResp list(Blog blog){

//        List<BlogListDto> list = Lists.newArrayList();
//        for (int i = 1; i <= 5; i++) {
//            BlogListDto dto = new BlogListDto();
//            dto.setTag("个人博客");
//            dto.setId(i);
//            dto.setTitle("帝国cms 首页或者列表无图，不使用默认图片的方法");
//            dto.setDetail("帝国cms列表页图文展示，或者首页图文展示，如果使用全图和文字，编辑起来比较麻烦，因为每一篇文章，你都得花时间去配图，所以，可有使用以下方法来实现。");
//            dto.setPublishDate("2018-12-18");
//            dto.setPageView(123);
//            dto.setImgUrl("http://localhost:8080/page/images/01.jpg");
//            list.add(dto);
//        }
        List<Blog> list = blogService.findList(blog);
        return BaseResp.succ(list);
    }

    @ApiOperation(value = "图文推荐")
    @RequestMapping(value = "graphicRecommend",method = RequestMethod.POST)
    @ResponseBody
    public BaseResp graphicRecommend(){

        return BaseResp.succ();
    }
}
