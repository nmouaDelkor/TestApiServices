package com.delkor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Spring Boot Application is first executed here via the Main Method.
 * 
 * Notice that the "Application" class is placed under a "ROOT DIRECTORY" of
 * "com.delkor", and all other packages are "SUBPACKAGES" of "ROOT". (E.G.
 * "com.delkor.controller" is a SUBPACKAGE of "com.delkor"). The reason for this
 * is because the Main Method of a Spring Boot package must be annotated
 * with @SpringBootApplication. If you hover over the Java Doc for this
 * annotation, you will see that the @SpringBootApplication annotation
 * "COMPONENT SCANS" all of the Classes within this ROOT package AND all of the
 * classes within ROOT's SUBPACKAGES. This is the reason for the current Package
 * structure (E.G. Put the Class with @SpringBootApplication and the Main Method
 * within a ROOT directory, and make sure all other classes that need to be
 * Component Scanned are under a SUBPACKAGE of the ROOT directory.
 * 
 * @author nmoua
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
