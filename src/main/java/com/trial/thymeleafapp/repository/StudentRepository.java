package com.trial.thymeleafapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trial.thymeleafapp.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
