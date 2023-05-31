package com.trial.thymeleafapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trial.thymeleafapp.model.Student;
import com.trial.thymeleafapp.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> getOne(Integer id) {
		return studentRepository.findById(id);
	}
	
	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}

}
