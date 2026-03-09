package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.*;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}