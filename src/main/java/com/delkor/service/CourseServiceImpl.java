package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.CourseRepo;
import com.delkor.model.Course;

/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	private CourseRepo courseRepo;

	public CourseServiceImpl(CourseRepo courseRepo) {
		this.courseRepo = courseRepo;
	}

	public Optional<Course> findById(int id) {
		return courseRepo.findById(id);
	}
	
	public List<Course> findAll() {
		List<Course> itemPartPOs = new ArrayList<Course>();
		for (Course itemPartPO : courseRepo.findAll()) {
			itemPartPOs.add(itemPartPO);
		}
		return itemPartPOs;
	}

	public void deleteAll() {
		courseRepo.deleteAll();
	}
	
	public Course save(Course course) {
		return courseRepo.save(course);
	}
	
	public String deleteById(int id) {
		courseRepo.deleteById(id);
		return id + "was deleted";
	}

}