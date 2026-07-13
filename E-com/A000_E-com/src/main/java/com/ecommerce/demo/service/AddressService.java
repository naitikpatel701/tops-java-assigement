package com.ecommerce.demo.service;

import java.util.List;

import com.ecommerce.demo.dto.AddressDto;

public interface AddressService {

	public AddressDto create(AddressDto dto);
	public List<AddressDto> list();
	public AddressDto retrive(Long id);
	public AddressDto update(AddressDto dto,Long id);
	public void delete(Long id);
	public List<AddressDto> addressByUser(Long id);
}
