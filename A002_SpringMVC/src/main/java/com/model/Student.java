package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="reg")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id; 
	String name;
	String email;
	String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
