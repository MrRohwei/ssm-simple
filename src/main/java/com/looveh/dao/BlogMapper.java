package com.looveh.dao;

import com.looveh.entity.Blog;

import java.util.List;

/**
 * 博客 Dao
 */
public interface BlogMapper {

    void insert(Blog blog);

    void update(Blog blog);

    Blog findById(int id);

    List<Blog> findByBlog(Blog blog);
}
