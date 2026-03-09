package com.example.demo.Repo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.ProductRepo;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.payLoad.ResourceNotFoundException;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product create(Product p) {
		// TODO Auto-generated method stub
		return productRepo.save(p);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product retrive(int cid) {
		// TODO Auto-generated method stub
		return productRepo.findById(cid).orElseThrow(()-> new ResourceNotFoundException("Product", "ID", cid));
	}

	@Override
	public Product update(Product p, int id) {
		// TODO Auto-generated method stub
		Product ps=productRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "ID", id));
		ps.setName(p.getName());
		return productRepo.save(ps);
	}

	@Override
	public Product destroy(int id) {
		// TODO Auto-generated method stub
		Product product=productRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "ID", id));
		productRepo.deleteById(id);
		return product;
	}

	@Override
	public List<Product> catlist(Category c) {
		// TODO Auto-generated method stub
		return productRepo.findBycategory(c);
	}
	
}