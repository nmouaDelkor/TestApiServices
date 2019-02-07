package com.delkor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.Professor;
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
public class ProfRestController {

	@Autowired
	private ProfService profService;
	
	@Autowired
	private StudentService studentService;

	// -- Everything is set as a GET REQUEST just to test... -- //
	@GetMapping("/getProfessor")
	public List<Professor> getProfessor() {
		return profService.findAll();
	}

	@GetMapping("/getProfessor/{id}")
	public Optional<Professor> getProfessorById(@PathVariable int id) {
		return profService.findById(id);
	}

	@GetMapping("/deleteProfessor/{id}")
//	@DeleteMapping("/deleteProfessor/{id}")
	public String deleteProfessor(@PathVariable int id) {
		return profService.deleteById(id);
	}

//	@GetMapping("/createProfessor/{ProfessorName}/{studentName}")
////	@PostMapping("/createProfessor/{ProfessorName}/{studentName}")
//	public Professor saveProfessorWithStudent(@PathVariable String ProfessorName, @PathVariable String studentName) {
//		Student student = new Student(studentName);
//		Professor Professor = new Professor(ProfessorName);
//		Professor.setStudent(student);
//		ProfessorService.save(Professor);
//		return Professor;
//	}

	@GetMapping("/createProfessor/{ProfessorName}")
//	@PostMapping("/createProfessor/{ProfessorName}")
	public Professor saveProfessor(@PathVariable String ProfessorName) {
		Professor Professor = new Professor(ProfessorName);
		profService.save(Professor);
		return Professor;
	}

	@GetMapping("/deleteallProfessor")
//	@DeleteMapping("/deleteProfessorall")
	public String deleteAllProfessor() {
		profService.deleteAll();
		return "Deleted all Professoressors.";
	}
	
	@GetMapping("/updateProfessor/{ProfessorId}/{ProfessorName}")
//	@PatchMapping("/updateProfessor/{ProfessorId}/{ProfessorName}")
	public Professor updateProfessor(@PathVariable int ProfessorId, @PathVariable String ProfessorName) {
		Professor Professor = getProfessorById(ProfessorId).get();
		Professor.setProfName(ProfessorName);
		profService.save(Professor);
		return Professor;
	}
	

}