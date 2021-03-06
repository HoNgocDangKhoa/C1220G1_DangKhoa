package com.example.baitap.service.impl;


import com.example.baitap.model.Blog;
import com.example.baitap.repository.BlogRepository;
import com.example.baitap.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> search(String name, Pageable pageable) {
        return blogRepository.findAllByTitleContaining(name, pageable);
    }

    @Override
    public Page<Blog> sort(Pageable pageable) {
        return blogRepository.findByOrderByRegistrationDateAsc(pageable);
    }

}
