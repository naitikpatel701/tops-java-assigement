package com.ecommerce.demo.service;

import java.util.List;

import com.ecommerce.demo.dto.UserDto;

public interface UserService {

	public UserDto create(UserDto dto);
	public List<UserDto> list();
	public UserDto retrive(Long id);
	public UserDto update(UserDto dto,Long id);
	public void delete(Long id);
	public List<UserDto> retrivebyRole(Long id);
}
