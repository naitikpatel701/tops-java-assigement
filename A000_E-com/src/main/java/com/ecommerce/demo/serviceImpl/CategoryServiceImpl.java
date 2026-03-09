package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.CategoryDto;
import com.ecommerce.demo.model.Category;
import com.ecommerce.demo.payLoad.ResourceNotFoundException;
import com.ecommerce.demo.repo.CategoryRepository;
import com.ecommerce.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public CategoryDto create(CategoryDto dto) {
		
		Category category=mapper.map(dto, Category.class);
		Category created=repo.save(category);
		return mapper.map(created, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> list() {
		
		List<Category> categories=repo.findAll();
		List<CategoryDto> dtos=categories.stream().map(category->{
			return mapper.map(category, CategoryDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public CategoryDto retrive(Long id) {
		Category category=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		return mapper.map(category, CategoryDto.class);
	}

	@Override
	public CategoryDto update(CategoryDto dto, Long id) {
		// TODO Auto-generated method stub
		Category category=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setCreatedAt(dto.getCreatedAt());
		return mapper.map(repo.save(category), CategoryDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Category category=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Category", "ID", id));
		repo.delete(category);
	}

}
