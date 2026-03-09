package com.example.demo.payLoad;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resource,String field,int id) {
		// TODO Auto-generated constructor stub
		super(String.format("%s With %s :%s is not found", resource,field,id));
	}

}
