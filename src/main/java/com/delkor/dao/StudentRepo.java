package com.delkor.dao;

import org.springframework.data.repository.CrudRepository;

import com.delkor.model.Student;

/**
 * @author nmoua
 *
 */
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
