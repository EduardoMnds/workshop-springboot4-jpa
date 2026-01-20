package com.dev.course.services;

import com.dev.course.entities.Category;
import com.dev.course.entities.Order;
import com.dev.course.repositories.CategoryRepository;
import com.dev.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
