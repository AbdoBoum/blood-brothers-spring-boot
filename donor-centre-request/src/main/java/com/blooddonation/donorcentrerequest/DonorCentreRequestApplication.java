package com.blooddonation.donorcentrerequest;

import com.blooddonation.donorcentrerequest.Entities.Centre;
import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import com.blooddonation.donorcentrerequest.Entities.Stock;
import com.blooddonation.donorcentrerequest.resources.CentreRepository;
import com.blooddonation.donorcentrerequest.resources.DonnateurRepository;
import com.blooddonation.donorcentrerequest.resources.StockRepository;
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

    @Autowired
    private CentreRepository centreRepository;

    @Autowired
    private DonnateurRepository donnateurRepository;

    public static void main(String[] args) {
        SpringApplication.run(DonorCentreRequestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Centre.class, Donnateur.class, Stock.class);

        Stock stock = new Stock(1l, 1l, 4);
        stockRepository.save(stock);
        Stock stock2 = new Stock(1l, 2l, 4);
        stockRepository.save(stock2);
        Stock stock3 = new Stock(1l, 3l, 4);
        stockRepository.save(stock3);

        Donnateur donnateur = new Donnateur("GY38457", "Boumahdi", "Abderrahim", "boum.abdo@gmail.com",
                "boum@980", "0658473922", 1, 1);
        Donnateur donnateur2 = new Donnateur("T29957", "AARABA", "Abdellah", "boum.abdo@gmail.com",
                "boum@980", "0658473922", 2, 1);
        donnateurRepository.save(donnateur); donnateurRepository.save(donnateur2);

        Centre centre = new Centre("CRTS", "0656873883", "contact@crts.ac.ma",
                "azery", "Avenue des FAR, Rabat", 1);
        Centre centre1 = new Centre("ABRS", "0555573883", "contact@abrs.ac.ma",
                "sdujqsdj12", "Boulevard Hassan II, Casablanca", 2);
        Centre centre2 = new Centre("RGTS", "0656873883", "contact@rgts.ac.ma",
                "193jdsfj", "Avenue des FAR, Casablanca", 2);
        centreRepository.save(centre); centreRepository.save(centre1); centreRepository.save(centre2);

    }

}
