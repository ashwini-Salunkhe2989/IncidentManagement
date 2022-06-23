package com.finleap.incidentManagement.incidentupdation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentupdation.model.IncidentDetails;
import com.finleap.incidentManagement.incidentupdation.repository.IncidentDetailsUpdateRepository;

import io.micrometer.core.annotation.Timed;

@RestController
public class IncidentUpdateController {
	
	
	
	@Autowired
	private IncidentDetailsUpdateRepository incidentDetailsUpdateRepository;
	
	@PutMapping("/updateIncident")
	@Timed(value = "updateIncident.time", description = "Time taken to update Incident")
	public IncidentDetails updateIncident(@RequestBody IncidentDetails incident) {
		
		System.out.println("incidentDetails"+incident);
		IncidentDetails incidentsaved=incidentDetailsUpdateRepository.save(incident);
			
		return incidentsaved;
	}
	
	


}
