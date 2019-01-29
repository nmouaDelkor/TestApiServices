package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.ItemPartRepository;
import com.delkor.model.ItemPart;

/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class ItemPartServiceImpl implements ItemPartService {

	private final ItemPartRepository itemPartRepository;

	public ItemPartServiceImpl(ItemPartRepository taskRepository) {
		this.itemPartRepository = taskRepository;
	}

	public Optional<ItemPart> findById(int id) {
		return itemPartRepository.findById(id);
	}
	
	public List<ItemPart> findAll() {
		List<ItemPart> itemParts = new ArrayList<ItemPart>();
		for (ItemPart itemPart : itemPartRepository.findAll()) {
			itemParts.add(itemPart);
		}
		return itemParts;
	}

	public ItemPart save(ItemPart task) {
		return itemPartRepository.save(task);
	}

	public String deleteById(int id) {
		itemPartRepository.deleteById(id);
		return String.format("ID: %d deleted.", id);
	}

}