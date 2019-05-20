package com.bloodBrothers.AuthentificationService;

import com.bloodBrothers.AuthentificationService.Models.Centre;
import com.bloodBrothers.AuthentificationService.Services.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthentificationServiceApplication implements CommandLineRunner {
	@Autowired
	CentreService centreService;
	public static void main(String[] args) {
		SpringApplication.run(AuthentificationServiceApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {

		centreService.createCentre(new Centre ("totoCentre","0340683","hamza@gmail.com","password","adresse",3l));
		centreService.createCentre(new Centre ("titiCentre","0340683","hamza@gmail.com","password1","adresse",3l));
		centreService.createCentre(new Centre ("zaatarCentre","0340683","hamza@gmail.com","password2","adresse",3l));
	}
}
