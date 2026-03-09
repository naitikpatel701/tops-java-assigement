package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.Role;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.payLoad.ResourceNotFoundException;
import com.ecommerce.demo.repo.UserRepository;
import com.ecommerce.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public UserDto create(UserDto dto) {
		
		User user=mapper.map(dto, User.class);
		User createdUser=repo.save(user); 
		return mapper.map(createdUser, UserDto.class);
	}

	@Override
	public List<UserDto> list() {
		
		List<User> all=repo.findAll();
		List<UserDto> dtos=all.stream().map(u->{
			return mapper.map(u, UserDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public UserDto retrive(Long id) {
		
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		return mapper.map(u, UserDto.class);
	}

	@Override
	public UserDto update(UserDto dto, Long id) {
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		u.setName(dto.getName());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setRole(mapper.map(dto.getRole(),Role.class));
		
		return mapper.map(repo.save(u), UserDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		User u=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "ID", id));
		repo.delete(u);
	}

	@Override
	public List<UserDto> retrivebyRole(Long id) {
		// TODO Auto-generated method stub
		List<User> users=repo.findByRoleId(id);
		List<UserDto> dtos=users.stream().map(u->{
			return mapper.map(u, UserDto.class);
		}).collect(Collectors.toList());
		return dtos;
	}

	

}
