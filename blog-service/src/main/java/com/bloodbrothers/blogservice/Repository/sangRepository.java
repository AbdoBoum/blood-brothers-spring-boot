package com.bloodbrothers.blogservice.Repository;

import com.bloodbrothers.blogservice.Entities.GroupSang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface sangRepository extends JpaRepository<GroupSang, Long> {
}
