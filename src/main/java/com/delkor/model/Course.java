package com.delkor.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Course implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	
	private String courseName;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "courseId")
//	private Courselist courselist;

//	public Course(String courseName, Courselist courselist) {
//		this.courseName = courseName;
//		this.courselist = courselist;
//	}
//	
	public Course(String courseName) {
		this.courseName = courseName;
	}

}
