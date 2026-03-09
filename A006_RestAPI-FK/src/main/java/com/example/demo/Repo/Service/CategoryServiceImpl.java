package com.example.demo.Repo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.model.Category;
import com.example.demo.payLoad.ResourceNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public Category create(Category c) {
		// TODO Auto-generated method stub
		return categoryRepo.save(c);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Category retrieve(int cid) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(cid).orElseThrow(()-> new ResourceNotFoundException("Category","ID",cid));
	}

	

	@Override
	public Category update(Category c, int id) {
		// TODO Auto-generated method stub
		Category cd=categoryRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Category","ID",id));
		cd.setName(c.getName());
		return categoryRepo.save(cd);
	}

	@Override
	public Category destroy(int id) {
		// TODO Auto-generated method stub
		Category cd=categoryRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Category","ID",id));
		categoryRepo.delete(cd);
		return cd;
	}

}
