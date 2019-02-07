package com.delkor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.Student;
import com.delkor.service.ProfService;
import com.delkor.service.StudentService;

/**
 * This Controller maps REST API calls.
 * 
 * Use the @RestController annotation to mark the class as a REST Controller.
 * Autowire all of your Service classes here, and map them to the appropriate
 * data.
 * 
 * Note that when annotating a method with REST API annotations such as -
 * 
 * @GetMapping @PostMapping @DeleteMapping @PutMapping @PatchMapping - simply
 *             returning any non-primitive data structure (such as a POJO or
 *             List) will return data to browsers in JSON Format.
 * 
 * @author nmoua
 *
 */
@RestController
public class StudentRestController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ProfService profService;

	@GetMapping("/getstudent")
	public List<Student> getStudent() {
		return studentService.findAll();
	}

	@GetMapping("/getstudent/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentService.findById(id);
	}

	@GetMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteById(id);
	}

	@GetMapping("/createstudent/{studentName}")
//	@PostMapping("/createstudent/{studentName}")
	public Student saveStudent(@PathVariable String studentName) {
		Student student = new Student(studentName);
		studentService.save(student);
		return student;
	}

	@GetMapping("/updatestudent/{studentId}/{studentName}")
//	@PatchMapping("/updatestudent/{studentId}/{studentName}")
	public Student updateStudent(@PathVariable int studentId, @PathVariable String studentName) {
		Student student = getStudentById(studentId).get();
		student.setStudentName(studentName);
		studentService.save(student);
		return student;
	}
	
	
}