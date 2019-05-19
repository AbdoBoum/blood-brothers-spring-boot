package com.blooddonation.donorcentrerequest.Repositories;

import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DonorRepository extends JpaRepository<Donnateur, Long> {
}