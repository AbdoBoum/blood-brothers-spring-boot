package com.BloodDonation.Centre.service;

import com.BloodDonation.Centre.model.Centre;
import com.BloodDonation.Centre.repository.CentreNotFoundException;
import com.BloodDonation.Centre.repository.CentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentreService {

    @Autowired
    private CentreRepository centreRepository;


    public List<Centre> getAllCentres() {
        return centreRepository.findAll();
    }


    public Centre getCentre(long id) throws CentreNotFoundException {

        Centre centre = centreRepository.findById(id).orElseThrow(() -> new CentreNotFoundException(id));

        return centre;

    }

    public Centre createCentre(Centre centre){

        return centreRepository.save(centre);

    }


    public Centre updateCentre(Centre centre, long id) throws CentreNotFoundException {

        Centre rendredCentre = centreRepository.findById(id).orElseThrow(() -> new  CentreNotFoundException(id));
        rendredCentre.setNomCentre(centre.getNomCentre());
        rendredCentre.setAdresseCentre(centre.getAdresseCentre());
        rendredCentre.setPasswordCentre(centre.getPasswordCentre());
        rendredCentre.setEmailCentre(centre.getEmailCentre());
        rendredCentre.setTelephoneCentre(centre.getTelephoneCentre());

        return centreRepository.save(rendredCentre);
//        rendredCentre.setPassword();
    }

    public ResponseEntity<?> deleteCentre(long id) throws CentreNotFoundException {
        Centre centre = centreRepository.findById(id).orElseThrow(() -> new CentreNotFoundException(id));
        centreRepository.delete(centre);
        return ResponseEntity.ok().build();
    }
}
