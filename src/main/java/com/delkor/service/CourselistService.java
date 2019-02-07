package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.Courselist;

/**
 * 
 * @author nmoua
 *
 */
public interface CourselistService {
	public Optional<Courselist> findById(int id);
	public List<Courselist> findAll();
	public Courselist save(Courselist courselist);
	public String deleteById(int id);
	public void deleteAll();
}