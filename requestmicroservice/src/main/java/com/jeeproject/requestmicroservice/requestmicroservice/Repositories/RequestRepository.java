package com.jeeproject.requestmicroservice.requestmicroservice.Repositories;

import com.jeeproject.requestmicroservice.requestmicroservice.Models.Demande;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Demande, String> {

}