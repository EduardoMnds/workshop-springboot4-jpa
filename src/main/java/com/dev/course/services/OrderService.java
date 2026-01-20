package com.dev.course.services;

import com.dev.course.entities.Order;
import com.dev.course.entities.User;
import com.dev.course.repositories.OrderRepository;
import com.dev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
