package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.Student;

/**
 * 
 * @author nmoua
 *
 */
public interface StudentService {
	public Optional<Student> findById(int id);
	public List<Student> findAll();
	public Student save(Student student);
	public String deleteById(int id);
	public void deleteAll();
}