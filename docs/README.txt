---------------------------------------------------------------
Author: Nhia Moua
Date: 1/25/2019
---------------------------------------------------------------
OVERVIEW SUMMARY:
This is a working sample template to be used for future
development in SPRING BOOT.
---------------------------------------------------------------
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
---------------------------------------------------------------
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
  projects are MODEL classes, DAO Repository and SERVICE 
  classes. (E.G. Only create Model/DAO/Service classes for each
  model that you create).
  
  	- Ex: If you map a "Student.java" Model Class, then you'll
  	  create a "StudentRepository.java" DAO class which extends
  	  some pre-built CRUD Library. Then you'll create a 
  	  "StudentService.java" interface, and finally an 
  	  implementation of "StudentServiceImpl.java".
  	  	- Note that by semantic convention in BOOT, "DAO objects
  	  	  are usually suffixed with 'XXX_Repository'"
---------------------------------------------------------------
CURRENT TECH LISTING:
-

-

-

-
---------------------------------------------------------------