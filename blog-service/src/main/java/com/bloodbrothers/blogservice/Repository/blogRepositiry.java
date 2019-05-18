package com.bloodbrothers.blogservice.Repository;

import com.bloodbrothers.blogservice.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface blogRepositiry extends JpaRepository<Blog, Long> {

}
