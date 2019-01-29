package com.delkor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.delkor.dao.ItemPartPoRepository;
import com.delkor.model.ItemPartPO;

/**
 * 
 * @author nmoua
 *
 */
@Service
@Transactional
public class ItemPartPoServiceImpl implements ItemPartPoService {

	private final ItemPartPoRepository itemPartPoRepository;

	public ItemPartPoServiceImpl(ItemPartPoRepository itemPartPORepository) {
		this.itemPartPoRepository = itemPartPORepository;
	}

	public Optional<ItemPartPO> findById(int id) {
		return itemPartPoRepository.findById(id);
	}
	
	public List<ItemPartPO> findAll() {
		List<ItemPartPO> itemPartPOs = new ArrayList<ItemPartPO>();
		for (ItemPartPO itemPartPO : itemPartPoRepository.findAll()) {
			itemPartPOs.add(itemPartPO);
		}
		return itemPartPOs;
	}

	public ItemPartPO save(ItemPartPO task) {
		return itemPartPoRepository.save(task);
	}

	public String deleteById(int id) {
		itemPartPoRepository.deleteById(id);
		return String.format("ID: %d deleted.", id);
	}

}