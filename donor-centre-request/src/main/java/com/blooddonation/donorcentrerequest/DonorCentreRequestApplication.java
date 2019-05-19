package com.blooddonation.donorcentrerequest;

import com.blooddonation.donorcentrerequest.Entities.Centre;
import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import com.blooddonation.donorcentrerequest.Repositories.CenterRepository;
import com.blooddonation.donorcentrerequest.Repositories.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DonorCentreRequestApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(DonorCentreRequestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Centre.class, Donnateur.class);
    }

}
