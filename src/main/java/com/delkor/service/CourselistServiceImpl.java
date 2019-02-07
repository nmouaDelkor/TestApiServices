package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.CourselistRepo;
import com.delkor.model.Courselist;

/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class CourselistServiceImpl implements CourselistService {

	private CourselistRepo courseListRepo;

	public CourselistServiceImpl(CourselistRepo courseListRepo) {
		this.courseListRepo = courseListRepo;
	}

	public Optional<Courselist> findById(int id) {
		return courseListRepo.findById(id);
	}
	
	public List<Courselist> findAll() {
		List<Courselist> itemPartPOs = new ArrayList<Courselist>();
		for (Courselist itemPartPO : courseListRepo.findAll()) {
			itemPartPOs.add(itemPartPO);
		}
		return itemPartPOs;
	}

	public void deleteAll() {
		courseListRepo.deleteAll();
	}
	
	public Courselist save(Courselist courselist) {
		return courseListRepo.save(courselist);
	}
	
	public String deleteById(int id) {
		courseListRepo.deleteById(id);
		return id + "was deleted";
	}

}