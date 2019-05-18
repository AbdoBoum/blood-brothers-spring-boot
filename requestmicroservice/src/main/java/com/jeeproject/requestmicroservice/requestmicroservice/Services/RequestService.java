package com.jeeproject.requestmicroservice.requestmicroservice.Services;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.Demande;
import com.jeeproject.requestmicroservice.requestmicroservice.Repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository mRequestRepository;

    public List<Demande> getTopics() {
        List<Demande> demandes = new ArrayList<>();
        mRequestRepository.findAll()
                .forEach(demandes::add);
        return demandes;
    }

    public Demande getDemande(String id) {
        return mRequestRepository.findById(id).get();
    }

    public void addDemande(Demande demande) {
        mRequestRepository.save(demande);
    }

    public void updateDemande(Demande demande) {
        mRequestRepository.save(demande);
    }

    public void deleteDemande(String id) {
        mRequestRepository.deleteById(id);
    }
}