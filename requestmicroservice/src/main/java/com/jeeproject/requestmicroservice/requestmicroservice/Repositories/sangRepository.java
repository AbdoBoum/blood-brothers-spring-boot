package com.jeeproject.requestmicroservice.requestmicroservice.Repositories;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.GroupSang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface sangRepository extends JpaRepository<GroupSang, Long> {
}