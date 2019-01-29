package com.delkor.service;

import java.util.List;

import com.delkor.model.Task;

/**
 * Services in SpringBoot work as to how they worked in Spring Framework and
 * Spring MVC. Create an Interface, and then an Implementation of the Service.
 * 
 * Note: Remember not to Annotate Interfaces in Spring.
 * 
 * @author nmoua
 *
 */
public interface TaskService {
	public Task findOne(int id);
	public List<Task> findAll();
	public Task save(Task task);
	public String delete(int id);
}