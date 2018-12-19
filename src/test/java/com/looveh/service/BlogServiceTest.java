package com.looveh.service;

import com.looveh.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName BlogServiceTest
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/19 16:51
 */
@RunWith(JUnit4.class)
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void testFindList(){
        Blog blog = new Blog();
        List<Blog> list = blogService.findList(blog);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
