package com.delkor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prt")
public class ItemPart {

	@Id
	@Column(name = "prt_seq_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="prt_num")
	private String partNumber;
	
	@Column(name="prt_desc")
	private String partDescription;

	public ItemPart() {
		super();
	}

	public ItemPart(String partNumber, String partDescription) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
	}
	
	public ItemPart(int id, String partNumber, String partDescription) {
		this.id = id;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	@Override
	public String toString() {
		return "ItemPart [id=" + id + ", partNumber=" + partNumber + ", partDescription=" + partDescription + "]";
	}
	

	
}
