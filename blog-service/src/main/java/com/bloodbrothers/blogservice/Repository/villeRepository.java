package com.bloodbrothers.blogservice.Repository;

import com.bloodbrothers.blogservice.Entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface villeRepository extends JpaRepository<Ville, Long> {
}
