package com.bloodbrothers.villesangservice.Repositories;

import com.bloodbrothers.villesangservice.Entities.GroupSang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SangReposiroty extends JpaRepository<GroupSang, Long> {
}
