package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.Professor;

/**
 * 
 * @author nmoua
 *
 */
public interface ProfService {
	public Optional<Professor> findById(int id);
	public List<Professor> findAll();
	public Professor save(Professor prof);
	public String deleteById(int id);
	public void deleteAll();
}