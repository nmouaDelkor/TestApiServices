package com.delkor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.Course;
import com.delkor.model.Courselist;
import com.delkor.service.CourselistService;

/**
 * 
 * @author nmoua
 *
 */
@RestController
public class CourselistController {

	@Autowired
	private CourselistService courselistService;

	// -- Everything is set as a GET REQUEST just to test... -- //
	@GetMapping("/getcourselist")
	public List<Courselist> getProfessor() {
		return courselistService.findAll();
	}

	@GetMapping("/getcourselist/{id}")
	public Optional<Courselist> getProfessorById(@PathVariable int id) {
		return courselistService.findById(id);
	}

	@GetMapping("/deletecourselist/{id}")
//	@DeleteMapping("/deleteProfessor/{id}")
	public String deleteProfessor(@PathVariable int id) {
		return courselistService.deleteById(id);
	}

	@GetMapping("/deleteallcourselist")
//	@DeleteMapping("/deleteProfessorall")
	public String deleteAllProfessor() {
		courselistService.deleteAll();
		return "Deleted all Professoressors.";
	}
	
}