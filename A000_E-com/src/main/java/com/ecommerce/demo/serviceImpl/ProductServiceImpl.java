package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.CategoryDto;
import com.ecommerce.demo.dto.ProductDto;
import com.ecommerce.demo.model.Category;
import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.payLoad.ResourceNotFoundException;
import com.ecommerce.demo.repo.ProductRepository;
import com.ecommerce.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public ProductDto create(ProductDto dto) {
		Product product=mapper.map(dto, Product.class);
		Product createdProduct=repo.save(product);
		return mapper.map(createdProduct, ProductDto.class);
	}

	@Override
	public List<ProductDto> list() {
		
		List<Product> all=repo.findAll();
		List<ProductDto> dtos=all.stream().map(p->{
			return mapper.map(p, ProductDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public ProductDto retrive(Long id) {
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		return mapper.map(p, ProductDto.class);
	}

	@Override
	public ProductDto update(ProductDto dto, Long id) {
		// TODO Auto-generated method stub
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		p.setName(dto.getName());
		p.setDescription(dto.getDescription());
		p.setPrice(dto.getPrice());
		p.setStockQty(dto.getStockQty());
		p.setImage(dto.getImage());
		p.setActive(true);
		p.setCreatedAt(dto.getCreatedAt());
		p.setCategory(mapper.map(dto.getCategory(), Category.class));
		return mapper.map(repo.save(p), ProductDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Product p=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product", "ID", id));
		repo.delete(p);
		
	}

	@Override
	public List<ProductDto> reteivebyCategory(Long id) {
		// TODO Auto-generated method stub
		List<Product> products=repo.findByCategoryId(id);
		List<ProductDto> dtos=products.stream().map(c->{
			return mapper.map(c, ProductDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

}
