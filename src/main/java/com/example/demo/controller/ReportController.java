package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@RestController
@CrossOrigin("*")
public class ReportController {
	@Autowired
	private StudentRepository studentRepo;
	
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentRepo.save(student);
		
	}
	
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudent(){
		return (List<Student>) studentRepo.findAll();
	}
	
	@PutMapping(value="updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@DeleteMapping(value="deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentRepo.deleteById(id);
		return "Student Deleted!";
	}
	
	
	

}
