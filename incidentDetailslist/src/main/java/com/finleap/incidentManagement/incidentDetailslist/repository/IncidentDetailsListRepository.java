package com.finleap.incidentManagement.incidentDetailslist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finleap.incidentManagement.incidentDetailslist.model.IncidentDetails;

@Repository
public interface IncidentDetailsListRepository extends CrudRepository<IncidentDetails, Integer> {

}
