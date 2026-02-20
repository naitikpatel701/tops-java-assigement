package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;

public interface StudentService {

	public Student create(Student st);
	public List<Student> read();
	public Student retrive(int id);
	public Student update(int id,Student st);
	public void destroy(int id);
	
}
