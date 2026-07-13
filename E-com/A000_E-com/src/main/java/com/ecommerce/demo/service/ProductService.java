package com.ecommerce.demo.service;

import java.util.List;

import com.ecommerce.demo.dto.ProductDto;

public interface ProductService {

	public ProductDto create(ProductDto dto);
	public List<ProductDto> list(int page,int size,String sortby,String sortdir);
	public ProductDto retrive(Long id);
	public ProductDto update(ProductDto dto,Long id);
	public void delete(Long id);
	public List<ProductDto> reteivebyCategory(Long id);
}
