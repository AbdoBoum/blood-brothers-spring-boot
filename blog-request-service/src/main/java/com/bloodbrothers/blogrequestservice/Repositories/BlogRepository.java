package com.bloodbrothers.blogrequestservice.Repositories;

import com.bloodbrothers.blogrequestservice.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface BlogRepository extends JpaRepository<Blog, Long> {

    @Query("select b from Blog b where b.titre like %:msg%")
    List<Blog> findBlogByTitreContains(@Param("msg") String msg);

    //public static final String FIND_BLOG = "SELECT id_blog, titre_blog, contenu_blog, image_blog, id_donnateur FROM Blog";

    //@Query(value = FIND_BLOG, nativeQuery = true)
    //public List<Blog> findAllBlogs();

}
