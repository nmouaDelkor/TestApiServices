package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.Course;

/**
 * 
 * @author nmoua
 *
 */
public interface CourseService {
	public Optional<Course> findById(int id);
	public List<Course> findAll();
	public Course save(Course course);
	public String deleteById(int id);
	public void deleteAll();
}