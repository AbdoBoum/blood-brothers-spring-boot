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
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableEurekaClient
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

        Donnateur donnateur7 = new Donnateur("GY38457", "Boumahdi", "Abderrahim", "boum.abdo@gmail.com",
                "boum@980", "0658473922", 1, 1);
        Donnateur donnateur8 = new Donnateur("T29957", "AARABA", "Abdellah", "boum.abdo@gmail.com",
                "boum@980", "0658473922", 2, 1);
        donnateurRepository.save(donnateur7); donnateurRepository.save(donnateur8);

        Centre centre = new Centre("CRTS", "0656873883", "contact@crts.ac.ma",
                "azery", "Avenue des FAR, Rabat", 1);
        Centre centre1 = new Centre("ABRS", "0555573883", "contact@abrs.ac.ma",
                "sdujqsdj12", "Boulevard Hassan II, Casablanca", 2);
        Centre centre2 = new Centre("RGTS", "0656873883", "contact@rgts.ac.ma",
                "193jdsfj", "Avenue des FAR, Casablanca", 2);
        centreRepository.save(centre); centreRepository.save(centre1); centreRepository.save(centre2);

        Donnateur donnateur1 = new Donnateur("U188000","Aaraa", "Abdallah", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 1, 1);
        Donnateur donnateur2 = new Donnateur("U888000", "Haddaoui","Anderrahim", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 2, 1);
        Donnateur donnateur3 = new Donnateur("U788000", "Kamzoun", "Anas", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 2, 2);
        Donnateur donnateur4 = new Donnateur("U688000", "Aouane", "Hamza", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 3, 3);
        Donnateur donnateur5 = new Donnateur("U588000", "Derkaoii", "Zakaria", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 4, 4);
        Donnateur donnateur6 = new Donnateur("U488000", "Hido", "Sm7md", "aa.abdo@gmail.com", "Abdooo", "+21260000000000", 1, 5);

        donnateurRepository.save(donnateur1);
        donnateurRepository.save(donnateur2);
        donnateurRepository.save(donnateur3);
        donnateurRepository.save(donnateur4);
        donnateurRepository.save(donnateur5);
        donnateurRepository.save(donnateur6);

        Centre centre11 = new Centre("centre1", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 1);
        Centre centre12 = new Centre("centre2", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 2);
        Centre centre21 = new Centre("centre3", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 4);
        Centre centre3 = new Centre("centre4", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 3);
        Centre centre4 = new Centre("centre5", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 2);
        Centre centre5 = new Centre("centre6", "+212666666666", "centre@gmail.com", "passCentre", "Rabat", 1);

        centreRepository.save(centre11);
        centreRepository.save(centre12);
        centreRepository.save(centre21);
        centreRepository.save(centre3);
        centreRepository.save(centre4);
        centreRepository.save(centre5);

        Stock stock11 = new Stock(1, 1, 10);
        Stock stock12 = new Stock(1, 4, 20);
        Stock stock21 = new Stock(2, 3, 10);
        Stock stock31 = new Stock(3, 2, 30);
        Stock stock4 = new Stock(4, 5, 10);
        Stock stock5 = new Stock(3, 5, 10);

        stockRepository.save(stock11);
        stockRepository.save(stock12);
        stockRepository.save(stock21);
        stockRepository.save(stock31);
        stockRepository.save(stock4);
        stockRepository.save(stock5);


    }

}
