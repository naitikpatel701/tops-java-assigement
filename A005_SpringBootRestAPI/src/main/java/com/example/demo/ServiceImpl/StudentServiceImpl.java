package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.Service.StudentService;
import com.example.demo.payLoad.ResourceNotFoundException;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	 StudentRepo repo;
	
	@Override
	public Student create(Student st) {
		// TODO Auto-generated method stub
		return repo.save(st);
	}

	@Override
	public List<Student> read() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student retrive(int id) {
		// TODO Auto-generated method stub
		
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","ID",id));
	}

	

	@Override
	public void destroy(int id) {
		// TODO Auto-generated method stub
		Student std=repo.findById(id).orElseThrow();
		repo.delete(std);
	}

	@Override
	public Student update(int id, Student st) {
		Student std=repo.findById(id).orElseThrow();
		std.setName(st.getName());
		std.setEmail(st.getEmail());
		return repo.save(std) ;
	}

}
