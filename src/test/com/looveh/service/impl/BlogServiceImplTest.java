package com.looveh.service.impl;

import com.looveh.entity.Blog;
import com.looveh.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
@WebAppConfiguration("scr/main/resources")
public class BlogServiceImplTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void findList() {
        Blog b = new Blog();
        List<Blog> list = blogService.findList(b);
        list.forEach(a->{
            System.out.println(a);
        });
    }

    @Test
    public void findById() {
        out(blogService.findById(1));
    }

    private void out(Object o){
        System.out.println(o);
    }
}