package com.blooddonation.donorcentrerequest.resources;

import io.javabrains.movieinfoservice.Entities.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface StockRepository extends CrudRepository<Stock, Long> {
}
