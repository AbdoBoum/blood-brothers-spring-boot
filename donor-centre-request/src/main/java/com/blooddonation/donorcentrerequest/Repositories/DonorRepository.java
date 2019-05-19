package com.blooddonation.donorcentrerequest.Repositories;

import com.blooddonation.donorcentrerequest.Entities.Donnateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface DonorRepository extends JpaRepository<Donnateur, Long> {

    @Override
    Optional<Donnateur> findById(Long aLong);

    Optional<Donnateur> findByNom(String nom);

    Boolean existsByEmail(String email);

    Boolean existsByCin(String cin);

}