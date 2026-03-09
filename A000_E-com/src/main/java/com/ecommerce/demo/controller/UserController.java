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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.repo.CartItemRepository;
import com.ecommerce.demo.service.RoleService;
import com.ecommerce.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	
	  
	  @Autowired
	  RoleService roleService;
	  
	  @Autowired
	  UserService service;

	 @PostMapping("/")
	 public ResponseEntity<UserDto> create(@RequestBody UserDto dto,@RequestParam("role") Long rid) {
		 
		 dto.setRole(roleService.retrive(rid));
		 UserDto createdUser=service.create(dto);
		 return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/")
	 public ResponseEntity<List<UserDto>> list() {
		 
		 List<UserDto> all=service.list();
		 return new ResponseEntity<>(all,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<UserDto> retrive(@PathVariable("id") Long id) {
		 
		UserDto users=service.retrive(id);
		return new ResponseEntity<>(users,HttpStatus.OK);
	 }
	  
	 @PutMapping("/{id}")
	 public ResponseEntity<UserDto> update(@RequestBody UserDto dto,@PathVariable("id") Long id,@RequestParam("role") Long rid) {
		 
		 dto.setRole(roleService.retrive(rid));
		 UserDto updated=service.update(dto, id);
		 return new ResponseEntity<>(updated,HttpStatus.CREATED);
	 }
	 
	 @DeleteMapping("/{id}")
	 public ResponseEntity delete(@PathVariable("id") Long id) {
		 
		 service.delete(id);
		 return new ResponseEntity("delete successfully",HttpStatus.OK);
	 }
	 
	 @GetMapping("/role/{id}")
	 public ResponseEntity<List<UserDto>>  retriveByRole(@PathVariable Long id) {
		 
		 List<UserDto> users=service.retrivebyRole(id);
		 return new ResponseEntity<>(users,HttpStatus.OK);
	 }
	 
}
