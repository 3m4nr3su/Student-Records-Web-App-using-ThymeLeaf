package com.trial.thymeleafapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trial.thymeleafapp.model.Student;
import com.trial.thymeleafapp.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Student> students = studentService.getAll();
		model.addAttribute("students", students);
		return "students";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Student> getOne(Integer id) {
		return studentService.getOne(id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Student student) {
		studentService.addNew(student);
		return "redirect:/students/getAll";
	}
	
	@RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/students/getAll";
	}
	
	@RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		studentService.delete(id);
		return "redirect:/students/getAll";
	}

}
