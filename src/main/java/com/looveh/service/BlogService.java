package com.looveh.service;

import com.looveh.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findList(Blog blog);

    Blog findById(int id);
}
