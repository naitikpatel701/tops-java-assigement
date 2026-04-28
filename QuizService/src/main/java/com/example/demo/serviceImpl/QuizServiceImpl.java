package com.example.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.QuizDto;
import com.example.demo.model.Quiz;
import com.example.demo.repo.QuizRepo;
import com.example.demo.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	QuizRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public QuizDto create(QuizDto dto) {
		// TODO Auto-generated method stub
		Quiz quiz=mapper.map(dto, Quiz.class);
		Quiz created=repo.save(quiz);
		return mapper.map(created, QuizDto.class);
	}

	@Override
	public List<QuizDto> list() {

		List<Quiz> all=repo.findAll();
		List<QuizDto> dtos=all.stream().map(u->{
			return mapper.map(u, QuizDto.class);
		}).collect(Collectors.toList());
		return  dtos;
		
	}

	@Override
	public QuizDto retrive(Long id) {
		
		Quiz q=repo.findById(id).orElseThrow();
		return mapper.map(q, QuizDto.class);
	}

	@Override
	public QuizDto update(QuizDto dto, Long id) {
		

		Quiz q=repo.findById(id).orElseThrow();
		dto.setZname(q.getZname());
		return mapper.map(repo.save(q), QuizDto.class);
	}

	@Override
	public void destroy(Long id) {
		// TODO Auto-generated method stub
		Quiz q=repo.findById(id).orElseThrow();
		repo.delete(q);
	}

}
