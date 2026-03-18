package com.ecommerce.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
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

import com.ecommerce.demo.dto.AddressDto;
import com.ecommerce.demo.service.AddressService;
import com.ecommerce.demo.service.UserService;

@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	UserService service;
	
	@Autowired
	ModelMapper mapper;
	
	@PostMapping("/")
	public ResponseEntity<AddressDto> create(@RequestBody AddressDto dto,@RequestParam("user") Long uid) {
		
		dto.setUser(service.retrive(uid));
		AddressDto createdAddress=addressService.create(dto);
		return new ResponseEntity<>(createdAddress,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<AddressDto>> list() {
		
		List<AddressDto> all=addressService.list();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AddressDto> retrive(@PathVariable("id") Long id) {
		
		AddressDto address=addressService.retrive(id);
		return new ResponseEntity<>(address,HttpStatus.OK);
	}
	
    @PutMapping("/{id}")
    public ResponseEntity<AddressDto> update(@RequestBody AddressDto dto,@RequestParam("user") Long uid,@PathVariable("id") Long id) {
    	
    	dto.setUser(service.retrive(uid));
    	AddressDto updated=addressService.update(dto, id);
    	return new ResponseEntity<>(updated,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
    	
    	addressService.delete(id);
    	return new ResponseEntity<>("Delete successfully",HttpStatus.OK);
    }
}
