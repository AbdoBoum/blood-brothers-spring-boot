package com.jeeproject.requestmicroservice.requestmicroservice.Repositories;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface villeRepository extends JpaRepository<Ville, Long> {
}