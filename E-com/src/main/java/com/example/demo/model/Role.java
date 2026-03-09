package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="role")
public class Role {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	@OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
	List<User> users;

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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
