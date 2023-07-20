package com.webservice.studentapi;

import com.webservice.studentapi.populators.StudentPopulator;
import com.webservice.studentapi.populators.impl.StudentPopulatorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class StudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
		System.out.print("started");
	}


}
