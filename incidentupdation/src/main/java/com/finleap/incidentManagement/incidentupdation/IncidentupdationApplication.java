package com.finleap.incidentManagement.incidentupdation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finleap.incidentManagement.incidentupdation.repository")
@ComponentScan("com.finleap.incidentManagement.incidentupdation.controller")
@EntityScan("com.finleap.incidentManagement.incidentupdation.model")

public class IncidentupdationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentupdationApplication.class, args);
	}

}
