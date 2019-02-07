package com.delkor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.Course;
import com.delkor.service.CourseService;

/**
 * 
 * @author nmoua
 *
 */
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/getcourse")
	public List<Course> getProfessor() {
		return courseService.findAll();
	}

	@GetMapping("/getcourse/{id}")
	public Optional<Course> getProfessorById(@PathVariable int id) {
		return courseService.findById(id);
	}

	@GetMapping("/deletecourse/{id}")
	public String deleteProfessor(@PathVariable int id) {
		return courseService.deleteById(id);
	}

	@GetMapping("/createcourse/{courseName}")
	public Course saveProfessor(@PathVariable String courseName) {
		Course course = new Course(courseName);
		courseService.save(course);
		return course;
	}

	@GetMapping("/deleteallcourses")
	public String deleteAllProfessor() {
		courseService.deleteAll();
		return "Deleted all Professors.";
	}
	
}