package com.looveh.service.impl;

import com.looveh.dao.BlogMapper;
import com.looveh.entity.Blog;
import com.looveh.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BlogServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2018/12/19 16:46
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> findList(Blog blog) {
        List<Blog> byBlog = blogMapper.findByBlog(blog);
        return byBlog;
    }

    @Override
    public Blog findById(int id) {
        return blogMapper.findById(id);
    }
}
