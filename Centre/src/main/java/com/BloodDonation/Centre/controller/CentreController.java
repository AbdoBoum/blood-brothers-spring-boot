package com.BloodDonation.Centre.controller;


import com.BloodDonation.Centre.service.CentreService;
import com.BloodDonation.Centre.model.Centre;
import com.BloodDonation.Centre.repository.CentreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CentreController {

    //instance of service with @Autowired annotation
    @Autowired
    CentreService centreService;

    @GetMapping("/centres")
    public List<Centre> getAllCentres(){
        return centreService.getAllCentres();
    }

    @GetMapping("/centres/{id}")
    public Centre getCentre(@PathVariable long id) throws CentreNotFoundException {
        return centreService.getCentre(id);
    }

    @PostMapping("/centres")
    public Centre createCentre(@RequestBody Centre centre){
        return centreService.createCentre(centre);
    }

    @PutMapping("/centres/{id}")
    public Centre updateCentre(@PathVariable long id,@RequestBody Centre centre) throws CentreNotFoundException {
        return centreService.updateCentre(centre,id);
    }

    @DeleteMapping("/centres/{id}")
    public void deleteCentre(@PathVariable long id) throws CentreNotFoundException {
        centreService.deleteCentre(id);
    }
}
