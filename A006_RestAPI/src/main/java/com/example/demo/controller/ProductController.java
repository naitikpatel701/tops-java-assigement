package com.example.demo.controller;

import java.util.ArrayList;
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

import com.example.demo.Repo.Service.CategoryService;
import com.example.demo.Repo.Service.ProductService;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final CategoryController categoryController;
	
	public ProductController(CategoryController categoryController) {
		
		this.categoryController = categoryController;
	}

	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/category/{id}")
	public ResponseEntity<ProductDto> create(@RequestBody Product p, @PathVariable int id) {
		
		Category c=categoryService.retrieve(id);
		p.setCategory(c);
		Product createProduct=productService.create(p);
		
		return new ResponseEntity<>(productToDto(createProduct),HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<ProductDto>> list(){
		
		List<Product> products=productService.list();
		List<ProductDto> pros=new ArrayList<>();
		for(Product p:products) {
			pros.add(productToDto(p));
		}
		return new ResponseEntity<>(pros,HttpStatus.OK);
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<List<ProductDto>> catlist(@PathVariable("id") int id){
		
		List<Product> products=productService.catlist(categoryService.retrieve(id));
		List<ProductDto> pros=new ArrayList<>();
		for(Product p:products) {
			pros.add(productToDto(p));
		}
		return new ResponseEntity<>(pros,HttpStatus.OK);
	}
	
	@PutMapping("/category/{id}")
	public ResponseEntity<ProductDto> update(@RequestBody Product p,@PathVariable int id) {
		
		Product product=productService.retrive(id);
	    Product updated = productService.update(p, id);
	    return new ResponseEntity<>(productToDto(updated),HttpStatus.OK);
	}
	
	@DeleteMapping("/category/{id}")
	public ResponseEntity<ProductDto> delete(@PathVariable int id) {
		
		Product deleted=productService.destroy(id);
		
		return new ResponseEntity<>(productToDto(deleted),HttpStatus.OK);
		
	}
	
	public ProductDto productToDto(Product p) {
		
		ProductDto dto=new ProductDto();
		dto.setId(p.getId());
		dto.setName(p.getName());
		dto.setPrice(p.getPrice());
		dto.setQty(p.getQty());
		 CategoryDto catDto = new CategoryDto();
	        catDto.setId(p.getCategory().getId());
	        catDto.setName(p.getCategory().getName());

	        dto.setCategory(catDto);
		return dto;
		
	}
	
	public Product dtoToProduct(ProductDto dto) {
		
		Product p=new Product();
		p.setName(dto.getName());
		p.setPrice(dto.getPrice());
		p.setQty(dto.getQty());
		return p;
		
	}
}
