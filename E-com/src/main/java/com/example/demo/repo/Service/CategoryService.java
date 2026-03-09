package com.example.demo.repo.Service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {

	public Category create(Category c);
	public List<Category> list();
	public Category retrieve(int cid);
	public Category update(Category c ,int id);
	public Category delete(int id);
}
