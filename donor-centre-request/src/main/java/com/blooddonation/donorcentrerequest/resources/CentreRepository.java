package com.blooddonation.donorcentrerequest.resources;

import com.blooddonation.donorcentrerequest.Entities.Centre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CentreRepository extends CrudRepository<Centre, Long> {

}
