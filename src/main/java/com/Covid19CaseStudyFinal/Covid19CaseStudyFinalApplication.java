package com.Covid19CaseStudyFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan("com.*")
@EntityScan("com.Covid19CaseStudyFinal.entity")
@CrossOrigin
public class Covid19CaseStudyFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19CaseStudyFinalApplication.class, args);
		System.out.println("Success!");
	}

}
