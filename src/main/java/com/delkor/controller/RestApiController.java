package com.delkor.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.Task;
import com.delkor.service.TaskService;

/**
 * This Controller maps REST API calls.
 * 
 * Use the @RestController annotation to mark the class as a REST Controller.
 * Autowire all of your Service classes here, and map them to the appropriate
 * data.
 * 
 * Note that when annotating a method with REST API annotations such as -
 * @GetMapping @PostMapping @DeleteMapping @PutMapping @PatchMapping - simply 
 * returning any non-primitive data structure (such as a POJO or List) will 
 * return data to browsers in JSON Format.
 * 
 * @author nmoua
 *
 */
@RestController
public class RestApiController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/getAllTasks")
	public List<Task> allTasks() {
		return taskService.findAll();
	}

	@GetMapping("/saveTask/{name}/{desc}")
	public Task saveTask(@PathVariable String name, @PathVariable String desc) {
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return task;
	}
	
	@GetMapping("/getTask/{id}")
	public Optional<Task> findTask(@PathVariable int id) {
		return taskService.findById(id);
	}
	
	@GetMapping("/deleteTask/{id}")
	public String deleteTask(@PathVariable int id) {
		return taskService.deleteById(id);
	}
	
	

}
