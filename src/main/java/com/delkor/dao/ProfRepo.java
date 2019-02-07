package com.delkor.dao;

import org.springframework.data.repository.CrudRepository;

import com.delkor.model.Professor;

/**
 * 
 * @author nmoua
 *
 */
public interface ProfRepo extends CrudRepository<Professor, Integer> {

	
}
