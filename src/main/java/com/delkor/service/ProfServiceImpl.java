package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.ProfRepo;
import com.delkor.model.Professor;


/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class ProfServiceImpl implements ProfService {

	private final ProfRepo profRepo;

	public ProfServiceImpl(ProfRepo repo) {
		this.profRepo = repo;
	}

	public Optional<Professor> findById(int id) {
		return profRepo.findById(id);
	}
	
	public List<Professor> findAll() {
		List<Professor> itemParts = new ArrayList<Professor>();
		for (Professor itemPart : profRepo.findAll()) {
			itemParts.add(itemPart);
		}
		return itemParts;
	}

	public Professor save(Professor prof) {
		return profRepo.save(prof);
	}

	public String deleteById(int id) {
		profRepo.deleteById(id);
		return String.format("ID: %d deleted.", id);
	}
	
	public void deleteAll() {
		profRepo.deleteAll();
	}

}