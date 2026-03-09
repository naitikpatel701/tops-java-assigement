package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	List<Product> findBycategory(Category c);

}
