package com.bloodbrothers.villesangservice.Repositories;

import com.bloodbrothers.villesangservice.Entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long> {
}
