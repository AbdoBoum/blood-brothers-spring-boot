package com.blooddonation.donorcentrerequest.resources;

import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface DonnateurRepository extends CrudRepository<Donnateur, Long> {
}
