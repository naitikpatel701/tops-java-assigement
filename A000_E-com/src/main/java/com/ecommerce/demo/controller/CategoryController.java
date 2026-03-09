package com.ecommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dto.CategoryDto;
import com.ecommerce.demo.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> create(@RequestBody CategoryDto dto) {
		
		CategoryDto createdCategory=service.create(dto);
		return new ResponseEntity<>(createdCategory,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> list() {
		
		List<CategoryDto> category=service.list();
		return new ResponseEntity<>(category,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> retrive(@PathVariable("id") Long id) {
		
		CategoryDto category=service.retrive(id);
		return new ResponseEntity<>(category,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDto> update(@RequestBody CategoryDto dto , @PathVariable("id") Long id) {
		
		CategoryDto category=service.update(dto, id);
		return new ResponseEntity<>(category,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		return new ResponseEntity("delete successfully",HttpStatus.OK);
	}

}
