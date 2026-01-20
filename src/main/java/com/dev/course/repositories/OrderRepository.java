package com.dev.course.repositories;

import com.dev.course.entities.Order;
import com.dev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {



}
