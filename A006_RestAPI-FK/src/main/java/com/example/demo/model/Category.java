package com.example.demo.model;

import java.util.List;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="cname")
	@NotBlank(message ="Name is required")
	String name;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product>  product;

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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	
}
