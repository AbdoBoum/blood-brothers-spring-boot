package com.bloodbrothers.blogservice;

import com.bloodbrothers.blogservice.Entities.Blog;
import com.bloodbrothers.blogservice.Entities.Donnateur;
import com.bloodbrothers.blogservice.Entities.GroupSang;
import com.bloodbrothers.blogservice.Entities.Ville;
import com.bloodbrothers.blogservice.Repository.DonorRepository;
import com.bloodbrothers.blogservice.Repository.blogRepositiry;
import com.bloodbrothers.blogservice.Repository.sangRepository;
import com.bloodbrothers.blogservice.Repository.villeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Timestamp;

@SpringBootApplication
public class BlogServiceApplication implements CommandLineRunner {

    @Autowired
    blogRepositiry mblogRepositiry;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    DonorRepository donorRepository;

    @Autowired
    sangRepository msangRepository;

    @Autowired
    villeRepository mvilleRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Blog.class);

        Ville v = new Ville(1l, "Rabat", null, null);
        mvilleRepository.save(v);

        GroupSang g = new GroupSang(1l, null, null);
        msangRepository.save(g);

        Donnateur donnateur = new Donnateur(1l, "GY35678", "BOUMAHDI", "ABDERRAHIM",
                "boum.abdo@gmail.com", "azerty@20394KJ", "0656458694", v, g, null);

        donorRepository.save(donnateur);
        Blog blog = new Blog(1l, "Blood Brothers", "Dummy Container",
                "localhost://image", new Timestamp(11l), donnateur);

        mblogRepositiry.save(blog);
    }
}
