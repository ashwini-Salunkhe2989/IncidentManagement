package com.finleap.incidentManagement.incidentDetailslist.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentDetailslist.model.IncidentDetails;
import com.finleap.incidentManagement.incidentDetailslist.repository.IncidentDetailsListRepository;

import io.micrometer.core.annotation.Timed;

@RestController
public class IncidentDetailsListController {
	
	
	@Autowired
	private IncidentDetailsListRepository incidentDetailsListRepository;
	
	@GetMapping("/getIncidentReport/{id}")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public Optional<IncidentDetails> getIncidentReport(@PathVariable int id) {
		
		System.out.println("incidentDetails"+id);
		
		Optional<IncidentDetails> incident=incidentDetailsListRepository.findById(id);
		
		System.out.println("list"+incident.isPresent());
		return incident;
	}
	
	@GetMapping("/getAllIncidentsReport")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public List<IncidentDetails> getAllIncidents() {
		
				
		Iterable<IncidentDetails> incident=incidentDetailsListRepository.findAll();
		List<IncidentDetails> result = new ArrayList<IncidentDetails>();
		
		incident.forEach(result::add);
		System.out.println("deleted"+result.size());
		return result;
	
	}

}
