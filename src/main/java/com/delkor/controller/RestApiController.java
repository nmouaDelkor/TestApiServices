package com.delkor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delkor.model.ItemPart;
import com.delkor.model.ItemPartPO;
import com.delkor.service.ItemPartPoService;
import com.delkor.service.ItemPartService;

/**
 * This Controller maps REST API calls.
 * 
 * Use the @RestController annotation to mark the class as a REST Controller.
 * Autowire all of your Service classes here, and map them to the appropriate
 * data.
 * 
 * Note that when annotating a method with REST API annotations such as -
 * 
 * @GetMapping @PostMapping @DeleteMapping @PutMapping @PatchMapping - simply
 *             returning any non-primitive data structure (such as a POJO or
 *             List) will return data to browsers in JSON Format.
 * 
 * @author nmoua
 *
 */
@RestController
public class RestApiController {

	@Autowired
	private ItemPartService itemPartService;

	@Autowired
	private ItemPartPoService itemPartPoService;

	// -- REST API for Item Parts -- //

	@GetMapping("/getpart")
	public List<ItemPart> allParts() {
		return itemPartService.findAll();
	}

	@GetMapping("/getpart/{id}")
	public Optional<ItemPart> findPart(@PathVariable int id) {
		return itemPartService.findById(id);
	}

	// TODO: This doesn't work due to constraints (can't delete parent row)
	// java.sql.SQLIntegrityConstraintViolationException: Cannot delete or update a
	// parent row: a foreign key constraint fails (`delkorapps`.`prt_po`, CONSTRAINT
	// `prt_po_ibfk_1` FOREIGN KEY (`prt_seq_id`) REFERENCES `prt` (`prt_seq_id`))
	@GetMapping("/deletepart/{id}")
	public String deletePart(@PathVariable int id) {
		return itemPartService.deleteById(id);
	}

	// TODO: Also doesn't work... Due to constraints?
	@GetMapping("/savepart/{id}/{partNum}/{partDesc}")
	public ItemPart saveTask(@PathVariable int id, @PathVariable String partNum, @PathVariable String partDesc) {
		ItemPart itemPart = new ItemPart(partNum, partDesc);
		itemPartService.save(itemPart);
		return itemPart;
	}

	// TODO: Create Update Part (how?) Either get the ItemPart by ID and alter the
	// Model Data or Define a Query...

	// -- REST API for Item Part POs -- //

	@GetMapping("/getpartpo")
	public List<ItemPartPO> allPartPOs() {
		return itemPartPoService.findAll();
	}

	@GetMapping("/getpartpo/{id}")
	public Optional<ItemPartPO> findPartPO(@PathVariable int id) {
		return itemPartPoService.findById(id);
	}

	@GetMapping("/deletepartpo/{id}")
	public String deletePartPO(@PathVariable int id) {
		return itemPartPoService.deleteById(id);
	}

	// TODO: Create Save Part PO... Need to retrieve the other ItemPart before you
	// can do a PO?
//	@GetMapping("/savePart/{partNum}/{partDesc}")
//	public ItemPartPO saveTask(@PathVariable String partNum, @PathVariable String partDesc) {
//		ItemPartPO itemPartPO = new ItemPartPO(partNum, partDesc);
//		itemPartPoService.save(itemPartPO);
//		return itemPartPO;
//	}

	// TODO: Create Update Part

}
