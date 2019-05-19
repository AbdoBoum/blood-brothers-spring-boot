package com.bloodbrothers.blogrequestservice.Repositories;

import com.bloodbrothers.blogrequestservice.Entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RequestRepository extends JpaRepository<Demande, Long> {
    List<Demande> findDemandeByIdCentre(long id);
    List<Demande> findDemandeByiIAndIdGroupSang(long id);
}
