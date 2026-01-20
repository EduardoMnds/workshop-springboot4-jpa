package com.dev.course.services;

import com.dev.course.entities.Category;
import com.dev.course.entities.Product;
import com.dev.course.repositories.CategoryRepository;
import com.dev.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
