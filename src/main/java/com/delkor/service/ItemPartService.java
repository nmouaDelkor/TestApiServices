package com.delkor.service;

import java.util.List;
import java.util.Optional;

import com.delkor.model.ItemPart;

/**
 * 
 * @author nmoua
 *
 */
public interface ItemPartService {
	public Optional<ItemPart> findById(int id);
	public List<ItemPart> findAll();
	public ItemPart save(ItemPart itemPart);
	public String deleteById(int id);
}