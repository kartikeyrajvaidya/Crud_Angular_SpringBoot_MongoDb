package com.springBootApp.simpleApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springBootApp.simpleApp.model.Student;
import com.springBootApp.simpleApp.repository.StudentRepository;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository ;
	
	@GetMapping("/students")
	public List<Student> getStudentList() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentByRollNo(@PathVariable("id") int id ) {
		
		return studentRepository.findOne(Integer.toString(id)) ;
		
	}
	
	

}
