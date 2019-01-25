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
	public List<Task> findAll();
	public void save(Task task);
	public void delete(int id);
}