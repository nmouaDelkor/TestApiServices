package com.delkor.dao;

import org.springframework.data.repository.CrudRepository;

import com.delkor.model.Task;

/**
 * DAO's are not explicitly defined from scratch in Spring Boot. Instead, Spring
 * Boot comes with pre-defined CRUD Query Classes which can be extended for easy
 * usage.
 * 
 * This Interface Class takes advantage of a pre-packaged CRUD Library which
 * already provides Save, FindAll, Delete, and other CRUD operations (Refer to
 * CrudRepository.class to see available CRUD methods).
 * 
 * To use an Interface Class such as this one, simply pass in the Model Object
 * that you want to Map to in the first Parameter, and leave the second
 * Parameter alone (the second Parameter simply refers to a numeric UID datatype
 * for the CrudRepository, which is auto-generated).
 * 
 * Note: Remember not to Annotate Interfaces in Spring.
 * 
 * @author nmoua
 *
 */
public interface TaskRepository extends CrudRepository<Task, Integer> {

	// If you need CUSTOM queries not provided by CrudRepository, you can define
	// them here with the help of annotations

	// CrudRepository Docs are here:
	// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
	// https://docs.spring.io/spring-data/jpa/docs/2.0.0.RELEASE/reference/html/#jpa.query-methods.at-query
	// https://docs.spring.io/spring-data/jpa/docs/2.0.0.RELEASE/reference/html/#repositories.custom-implementations
	
	// Example
	// Sample Tutorial: http://zetcode.com/springboot/datajpaquery/
	// Summary: Annotate your custom query with @Query and pass a Param of the actual SQL query you want executed
	//	@Query("select c from City c where c.name like %?1")
	//	List<City> findByNameEndsWith(String chars);
	
}
