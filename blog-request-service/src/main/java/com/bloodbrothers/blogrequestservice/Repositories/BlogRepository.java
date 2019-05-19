package com.bloodbrothers.blogrequestservice.Repositories;

import com.bloodbrothers.blogrequestservice.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findBlogByTitreContains(String titre);
}