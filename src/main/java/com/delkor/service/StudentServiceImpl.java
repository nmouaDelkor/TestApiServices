package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.StudentRepo;
import com.delkor.model.Student;

/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	private final StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public Optional<Student> findById(int id) {
		return studentRepo.findById(id);
	}
	
	public List<Student> findAll() {
		List<Student> itemPartPOs = new ArrayList<Student>();
		for (Student itemPartPO : studentRepo.findAll()) {
			itemPartPOs.add(itemPartPO);
		}
		return itemPartPOs;
	}

	public void deleteAll() {
		studentRepo.deleteAll();
	}
	
	public String deleteById(int id) {
		studentRepo.deleteById(id);
		return id + "was deleted";
	}
	
	public Student save(Student student) {
		return studentRepo.save(student);
	}

}