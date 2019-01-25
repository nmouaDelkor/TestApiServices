package com.delkor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Models are defined as per previous normal specs in Spring and Spring MVC.
 * Annotate the class with @Entity.
 * 
 * Annotated the Primary Key with @Id and @GeneratedValue.
 * 
 * Annotate Dates with @Temporal.
 * 
 * @author nmoua
 *
 */
@Entity(name = "t_tasks")
public class Task {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean finished;

	public Task() {
		super();
	}

	public Task(int id, String name, String description, Date dateCreated, boolean finished) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}

	public Task(String name, String description, Date dateCreated, boolean finished) {
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", finished=" + finished + "]";
	}
}
