package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.AddressDto;
import com.ecommerce.demo.model.Address;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.payLoad.ResourceNotFoundException;
import com.ecommerce.demo.repo.AddressRepository;
import com.ecommerce.demo.service.AddressService;
import com.ecommerce.demo.service.UserService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	ModelMapper mapper;
	
	@Autowired
	AddressRepository repo;
	
	@Autowired
	UserService service;
	
	@Override
	public AddressDto create(AddressDto dto) {
		
		Address address=mapper.map(dto, Address.class);
		Address createdAddress=repo.save(address);
		return mapper.map(createdAddress, AddressDto.class);
	}

	@Override
	public List<AddressDto> list() {
		
		List<Address> all=repo.findAll();
		List<AddressDto> dtos=all.stream().map(a->{
			return mapper.map(a, AddressDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public AddressDto retrive(Long id) {
		// TODO Auto-generated method stub
		Address a=repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Address","ID",id));
		return mapper.map(a, AddressDto.class);
	}

	@Override
	public AddressDto update(AddressDto dto, Long id) {
		// TODO Auto-generated method stub
		Address a=repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Address","ID",id));
		a.setAddressLine(dto.getAddressLine());
		a.setCity(dto.getCity());
		a.setCountry(dto.getCountry());
		a.setPincode(dto.getPincode());
		a.setState(dto.getState());
		a.setDefault(dto.isDefault());
		return mapper.map(repo.save(a), AddressDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Address a=repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Address","ID",id));
		repo.delete(a);
	}

	@Override
	public List<AddressDto> addressByUser(Long id) {
		// TODO Auto-generated method stub
		List<Address> all=repo.findByUser(mapper.map(service.retrivebyRole(id), User.class));
		List<AddressDto> dtos=all.stream().map(a->{
			return mapper.map(a, AddressDto.class);
		}).collect(Collectors.toList());
		return dtos;
	
	}

}
