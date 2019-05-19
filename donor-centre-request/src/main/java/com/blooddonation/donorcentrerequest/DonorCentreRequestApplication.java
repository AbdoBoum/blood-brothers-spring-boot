package com.blooddonation.donorcentrerequest;

import com.blooddonation.donorcentrerequest.Entities.Centre;
import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import com.blooddonation.donorcentrerequest.Entities.Stock;
import com.blooddonation.donorcentrerequest.Repositories.CenterRepository;
import com.blooddonation.donorcentrerequest.Repositories.DonorRepository;
import com.blooddonation.donorcentrerequest.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DonorCentreRequestApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    private StockRepository stockRepository;

    public static void main(String[] args) {
        SpringApplication.run(DonorCentreRequestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Centre.class, Donnateur.class,Stock.class);

        Stock stock = new Stock(1l,1l,4);
        stockRepository.save(stock);
        Stock stock2 = new Stock(1l,2l,4);
        stockRepository.save(stock2);
        Stock stock3 = new Stock(1l,3l,4);
        stockRepository.save(stock3);
    }

}
