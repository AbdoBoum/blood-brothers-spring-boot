package com.blooddonation.donorcentrerequest.Repositories;

import com.blooddonation.donorcentrerequest.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StockRepository extends JpaRepository<Stock, Integer> {
}
