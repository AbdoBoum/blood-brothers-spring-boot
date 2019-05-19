package com.bloodbrothers.blogrequestservice.Repositories;

import com.bloodbrothers.blogrequestservice.Entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RequestRepository extends JpaRepository<Demande, Long> {

    @Query("Select d from Demande d where d.idCentre = :id")
    List<Demande> findDemandeByIdCentre(@Param("id") long id);

    @Query("Select d from Demande d where d.idGroupSang = :id")
    List<Demande> findDemandeByiIAndIdGroupSang(@Param("id") long id);
}
