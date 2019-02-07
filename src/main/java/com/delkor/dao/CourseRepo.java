package com.delkor.dao;

import org.springframework.data.repository.CrudRepository;

import com.delkor.model.Course;

/**
 * 
 * @author nmoua
 *
 */
public interface CourseRepo extends CrudRepository<Course, Integer> {

	
}
