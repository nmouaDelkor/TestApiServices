----------------------------------------------------------------
Author: Nhia Moua
Date: 1/25/2019
----------------------------------------------------------------
OVERVIEW SUMMARY:
This is a working sample template to be used for future
development in SPRING BOOT.
----------------------------------------------------------------
CONFIGURATION NOTES:
- The project uses no legacy XML Config, etc.

- Database Connections are defined in "application.properties"

- Dispatcher-Servlet is autowired by SpringBoot and 
  Prefix/Suffixes are defined in "application.properties"
  
- JSON is pretty formatted via the JACKSON library, within a
  plugin stored in "application.properties".
  
- Controllers are configured with Java Annotations:
	- @Controller for Web Controllers
	- @RestController for REST API Controllers
	
- Component Scans are managed with Java Annotations:
	- @SpringBootApplication in the Java Class with the main
	  method. Check the "Application.java" class for more info.
	  
- Since Boot runs with an embedded Tomcat Server, you can 
  adjust which PORT the Tomcat Server connects within the
  "application.properties" file.
  		>> server.port=8081
  		
----------------------------------------------------------------
DEV NOTES:
- If you need to add WEB URL Mappings:
	- Add them in "WebController.java"
	
- If you need to add REST API Mappings:
	- Add them in "RestApiController.java"
	
- No future Controllers should need to be created by following
  the above two notes...

- Read the comments in "TaskRepository.java" to understand how
  DAO Structure differentiates in Spring Boot vs Spring MVC, etc.
  
- The only new Java Classes that need to be created for future
  projects are MODEL, DAO Repository and SERVICE classes. 
  (E.G. Only create DAO & Service classes for each model that
  you create).
  
  	- Ex: If you map a "Student.java" Model Class, then you'll
  	  create a "StudentRepository.java" DAO class which extends
  	  some pre-built CRUD Library. Then you'll create a 
  	  "StudentService.java" interface, and finally an 
  	  implementation of "StudentServiceImpl.java".
  	  	- Note that by semantic convention in BOOT, "DAO objects
  	  	  are usually suffixed with 'XXX_Repository'"
  	  	  
  	  	- Note that you don't create "XXX_Repository" and then
  	  	  "XXX_RepositoryImpl". This is because DAOs are used
  	  	  as Interfaces in Boot convention. To extend the
  	  	  Interface for Custom Queries, add new methods in the
  	  	  Interface which adhere to JPA / CrudRepository
  	  	  standards (these standards are linked & discussed in 
  	  	  the comments found in TaskRepository.java).
  	  	  
  	  	- https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
		- https://docs.spring.io/spring-data/jpa/docs/2.0.0.RELEASE/reference/html
----------------------------------------------------------------
CURRENT TECH STACK INFO - DATE RELEASED - SUPPORT UNTIL:
- Java 8 
	- Released: 2014
	- Support End Date: Long-Term Support
	- Dev Notes: Update to Java 11 when 11 more mature.
	
- MySQL 5.7.24
	- Released: 2015
	- Support End Date: 2023
	- Dev Notes: Update to MySQL 8.0. Project structure and 
	  dependencies are already setup for 8.0 (the reason we can
	  connect to 5.7.24 is because 8.0 config settings have
	  backwards compatibility.
	
- Spring Boot 2.1.2 
	- Released: 2018
	- Support End Date: N/A
	- Dev Notes: None. Look through Boot 2.1.2 Docs, to see 
	  info on specific libraries Boot 2.1.2 comes with.
----------------------------------------------------------------