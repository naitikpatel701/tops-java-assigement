package com.ecommerce.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.demo.A000EComApplication;
import com.ecommerce.demo.dto.ProductDto;
import com.ecommerce.demo.service.CategoryService;
import com.ecommerce.demo.service.ProductService;
import com.ecommerce.demo.service.ImageService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final A000EComApplication a000EComApplication;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService service;
	
	@Autowired
	ImageService imageService;
	
	@Value("${project.image}")
	String path;


    ProductController(A000EComApplication a000EComApplication) {
        this.a000EComApplication = a000EComApplication;
    }
	
    @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/")
	public ResponseEntity<ProductDto> create(@RequestBody ProductDto dto,@RequestParam("category") Long cid) {
		
		dto.setCategory(categoryService.retrive(cid));
		ProductDto createdProduct=service.create(dto);
		return new ResponseEntity<>(createdProduct,HttpStatus.CREATED);
	}
	
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping("/")
	public ResponseEntity<List<ProductDto>> list(
	        @RequestParam(defaultValue = "0" ,name="page") int page,
			@RequestParam(defaultValue = "1" ,name="size") int size,
			@RequestParam(defaultValue = "name" ,name="sortby") String sortby,
			@RequestParam(defaultValue = "asc" ,name="sortdir") String sortdir) {
		
		List<ProductDto> all=service.list(page,size,sortby,sortdir);
		
		all.stream().map(p->{
			p.setImage("localhost:8080/products/image/"+p.getImage());
			return p;
		}).collect(Collectors.toList());
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> retrive(@PathVariable("id") Long id) {
		
		ProductDto products=service.retrive(id);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public ResponseEntity<ProductDto> update(@RequestBody ProductDto dto,@RequestParam("category") Long cid,@PathVariable("id") Long id) {
		
		dto.setCategory(categoryService.retrive(cid));
		ProductDto updated=service.update(dto, id);
		return new ResponseEntity<>(updated,HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		return new ResponseEntity<>("delete successfully",HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/category/{id}")
    public ResponseEntity<List<ProductDto>> retriveByCategory(@PathVariable Long id) {
		
		List<ProductDto> products=service.reteivebyCategory(id);
		return new ResponseEntity<>(products,HttpStatus.OK);
		
	}
	
	@PostMapping("/image/{pid}")
	public ResponseEntity<ProductDto> uploadimage(@PathVariable("pid") Long pid,@RequestParam("file") MultipartFile file) {
		
		System.out.println(path);
		ProductDto dto=service.retrive(pid);
		String filename=imageService.uploadImage(path, file);
		dto.setImage(filename);
		
		ProductDto updated=service.update(dto, pid);
		return new ResponseEntity<>(updated,HttpStatus.CREATED);
	}
	
	@GetMapping("/image/{imagename}")
	public ResponseEntity<byte[]> getimage(@PathVariable String imagename) throws IOException {
		
		String fullpath=path+File.separator+imagename;
		
		byte[] image=Files.readAllBytes(Paths.get(fullpath));
		
		String contentType=Files.probeContentType(Paths.get(fullpath));
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.parseMediaType(contentType))
				.body(image);
	}
	
}
