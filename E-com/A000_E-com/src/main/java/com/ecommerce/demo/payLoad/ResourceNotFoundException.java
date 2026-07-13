package com.ecommerce.demo.payLoad;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resource,String field,Long id) {
		// TODO Auto-generated constructor stub
		super(String.format("%s With %s :%s is not found", resource,field,id));
	}

}
