package com.jeeproject.requestmicroservice.requestmicroservice;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.*;
import com.jeeproject.requestmicroservice.requestmicroservice.Repositories.CentreRepository;
import com.jeeproject.requestmicroservice.requestmicroservice.Repositories.RequestRepository;
import com.jeeproject.requestmicroservice.requestmicroservice.Repositories.sangRepository;
import com.jeeproject.requestmicroservice.requestmicroservice.Repositories.villeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Timestamp;

@SpringBootApplication
@EnableEurekaClient
public class RequestmicroserviceApplication implements CommandLineRunner {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RequestRepository mRequestRepositiry;

    @Autowired
    CentreRepository mCentreRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    sangRepository msangRepository;

    @Autowired
    villeRepository mvilleRepository;

    public static void main(String[] args) {
        SpringApplication.run(RequestmicroserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Demande.class);

        Demande demande = new Demande("demande", "description", new Timestamp(11l),"F:/image.png",true, true,null,null);
        mRequestRepositiry.save(demande);

        Centre centre = new Centre("nom centre","+213983783","centre@gmail.com","password","adresse",null,null,null);
        mCentreRepository.save(centre);


    }
}
