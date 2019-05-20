package com.bloodbrothers.blogrequestservice;

import com.bloodbrothers.blogrequestservice.Entities.Blog;
import com.bloodbrothers.blogrequestservice.Entities.Demande;
import com.bloodbrothers.blogrequestservice.Repositories.BlogRepository;
import com.bloodbrothers.blogrequestservice.Repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Timestamp;

@SpringBootApplication
@EnableEurekaClient
public class BlogRequestServiceApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private RequestRepository requestRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogRequestServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Blog.class, Demande.class);


        Demande demande = new Demande("Blood Request", "Blood Needed ASAP", new Timestamp(System.currentTimeMillis()),
                "C://user/Abderrahim/desktop/img.png", false, true, 1l, 1);
        Demande demande1 = new Demande("Another Blood Request", "Blood Needed ASAP", new Timestamp(System.currentTimeMillis()),
                "C://user/Abderrahim/desktop/img.png", true, true, 2l, 2);
        requestRepository.save(demande);
        requestRepository.save(demande1);
    }
}
