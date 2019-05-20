package com.bloodBrothers.AuthentificationService.Services;

import com.bloodBrothers.AuthentificationService.Models.Centre;
import com.bloodBrothers.AuthentificationService.Repositorys.CentreNotFoundException;
import com.bloodBrothers.AuthentificationService.Repositorys.CentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CentreService implements UserDetailsService {

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

    public UserDetails loadByNamePassword(String name, String password) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(password);
        Centre centre = centreRepository.findByNamePassword(name,password).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return centre;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Objects.requireNonNull(s);

        Centre centre = centreRepository.findByName(s).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return centre;
    }
}
