package com.blooddonation.donorcentrerequest.Repositories;

import com.blooddonation.donorcentrerequest.Entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CenterRepository extends JpaRepository<Centre, Long> {
}