package com.delkor.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
@Table(name = "prt_po")
public class ItemPartPO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prt_po_seq_id")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prt_seq_id")
	private ItemPart itemPart;

	@Column(name = "po_num")
	private String poNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "po_dt")
	private Date poDate;

	@Column(name = "vendor_num")
	private String vendorNumber;

	@Column(name = "vendor_nm")
	private String vendorName;

	@Column(name = "po_src_cd")
	private String poSourceCode;

	public ItemPartPO(ItemPart itemPart, String poNumber, String vendorNumber, String vendorName, String poSourceCode) {
		this.itemPart = itemPart;
		this.poNumber = poNumber;
		this.vendorNumber = vendorNumber;
		this.vendorName = vendorName;
		this.poSourceCode = poSourceCode;
	}

	public ItemPartPO(int id, ItemPart itemPart, String poNumber, Date poDate, String vendorNumber, String vendorName,
			String poSourceCode) {
		super();
		this.id = id;
		this.itemPart = itemPart;
		this.poNumber = poNumber;
		this.poDate = poDate;
		this.vendorNumber = vendorNumber;
		this.vendorName = vendorName;
		this.poSourceCode = poSourceCode;
	}

}
