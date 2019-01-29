package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.ItemPartPO;

/**
 * 
 * @author nmoua
 *
 */
public interface ItemPartPoService {
	public Optional<ItemPartPO> findById(int id);
	public List<ItemPartPO> findAll();
	public ItemPartPO save(ItemPartPO itemPart);
	public String deleteById(int id);
}