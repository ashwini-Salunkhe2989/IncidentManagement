package com.finleap.incidentManagement.incidentdeletion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentdeletion.repository.DeleteIncidentRepository;

import io.micrometer.core.annotation.Timed;

@RestController
public class DeletionincidentController {
	
	@Autowired
	private DeleteIncidentRepository deleteIncidentRepository;
	
	@DeleteMapping("/deleteIncident/{id}")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public void createIncident(@PathVariable int id) {
		
		System.out.println("incidentDetails"+id);
		
		deleteIncidentRepository.deleteById(id);
		
		System.out.println("deleted"+id);
	}


}
