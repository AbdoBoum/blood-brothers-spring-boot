package com.bloodBrothers.AuthentificationService.Repositorys;

import com.bloodBrothers.AuthentificationService.Models.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CentreRepository extends JpaRepository<Centre, Long> {
    @Query("SELECT c FROM Centre c where c.nomCentre =:nom and c.passwordCentre =:password")
    Optional<Centre> findByNamePassword(@Param("nom") String name,@Param("password") String password);

    @Query("SELECT c FROM Centre c where c.nomCentre =:nom")
    Optional<Centre> findByName(@Param("nom") String s);
}
