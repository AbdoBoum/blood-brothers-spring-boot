package com.jeeproject.requestmicroservice.requestmicroservice.Repositories;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CenterRepository extends JpaRepository<Centre, Long> {
}
