package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.TaskRepository;
import com.delkor.model.Task;

/**
 * Services in SpringBoot work as to how they worked in Spring Framework and
 * Spring MVC. Create an Interface, and then an Implementation of the Service.
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	// Reason we don't have to Autowire this is because TaskRepository extends from
	// CrudRepository, which is already packaged within Spring and initialized. This
	// is also the reason why we mark it as FINAL (we only ever want one instance of
	// a Repository for each Service).
	private final TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Optional<Task> findById(int id) {
		return taskRepository.findById(id);
	}
	
	public List<Task> findAll() {
		List<Task> tasks = new ArrayList<Task>();
		for (Task task : taskRepository.findAll()) {
			tasks.add(task);
		}
		return tasks;
	}

	public Task save(Task task) {
		return taskRepository.save(task);
	}

	public String deleteById(int id) {
		taskRepository.deleteById(id);
		return String.format("ID: %d deleted.", id);
	}

}