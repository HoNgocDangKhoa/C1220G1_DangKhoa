package com.example.baitap.repository;

import com.example.baitap.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category>findAll();
}
