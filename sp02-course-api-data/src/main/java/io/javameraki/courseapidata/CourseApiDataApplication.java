package io.javameraki.courseapidata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class CourseApiDataApplication {
	// PART TWO
	/**  ORM does it maps the entity classes into sequel tables so that when you connect to the database to
	 provide some kind of meta data on your entity classes so that you don't have to do the query and
	 the mapping yourself you have framework that handles. */

	// JPA -
	// Spring Data JPA helps to connect to a relational database and you provide on your entity classes and then the framework handles alot of work you. .

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
