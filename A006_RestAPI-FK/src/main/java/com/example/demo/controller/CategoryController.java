package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.Repo.Service.CategoryService;
import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	 private final CategoryRepo categoryRepo ;
	 
	 @Autowired
	 CategoryService categoryService;

	 public CategoryController(CategoryRepo categoryRepo) {
		
		this.categoryRepo = categoryRepo;
	 }
	 
	 @PostMapping("/")
	 public ResponseEntity<CategoryDto> create(@Valid @RequestBody Category c) {
		 
		 Category created=categoryService.create(c);
		 return new ResponseEntity<>(categoryToDto(created),HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/")
	 public ResponseEntity<List<CategoryDto>> list(){
		
		 List<Category> all=categoryService.list();
		 List<CategoryDto> dtos=new ArrayList<>();
		 for(Category c:all) {
			 dtos.add(categoryToDto(c));																																	
		 }
		 return new ResponseEntity<>(dtos,HttpStatus.OK);
		 
	 }
	 @GetMapping("/{id}")
	 public ResponseEntity<CategoryDto> retrive(@PathVariable int id) {
		 
	Category category=categoryService.retrieve(id);
	return new ResponseEntity<>(categoryToDto(category),HttpStatus.OK);
		 
	 }
	 
	 @PutMapping("/{id}")
	 public ResponseEntity<Category> update(@RequestBody Category c ,@PathVariable int id) {
		 
		 Category category=categoryService.retrieve(id);
		 Category updated=categoryService.update(c, id);
		 
		 return new ResponseEntity<>((updated),HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/{id}")
	 public ResponseEntity<CategoryDto> delete(@PathVariable int id) {
		
		 Category deleted = categoryService.destroy(id);
		 
		 return new ResponseEntity<>(categoryToDto(deleted),HttpStatus.OK);
	 }
	 
	 public static CategoryDto categoryToDto(Category c) {
		 
		 CategoryDto dto=new CategoryDto();
		 dto.setId(c.getId());
		 dto.setName(c.getName());
		 
		 return dto;
	 }
	 
	 public Category dtoToCategory(CategoryDto c) {
		 
		 Category cat=new Category();
		 cat.setId(c.getId());
		 cat.setName(c.getName());
		 
		 return cat;
	 }
}
