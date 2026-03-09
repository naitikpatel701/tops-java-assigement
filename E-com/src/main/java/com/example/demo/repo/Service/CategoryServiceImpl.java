package com.example.demo.repo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.EComApplication;
import com.example.demo.model.Category;
import com.example.demo.payLoad.ResourceNotFoundException;
import com.example.demo.repo.CategoryRepo;

@Service
public class CategoryServiceImpl  implements CategoryService{


	@Autowired
	CategoryRepo repo;

   
	
	@Override
	public Category create(Category c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Category retrieve(int cid) {
		// TODO Auto-generated method stub
		return repo.findById(cid).orElseThrow(()-> new ResourceNotFoundException("category","Id",cid));
	}

	@Override
	public Category update(Category c, int id) {
		// TODO Auto-generated method stub
		Category cd= repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("category","Id",id));
		cd.setName(c.getName());
		return repo.save(cd);
	}

	@Override
	public Category delete(int id) {
		// TODO Auto-generated method stub
		Category cd= repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("category","Id",id));
		repo.delete(cd);
		return cd;
	}

}
