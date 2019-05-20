package com.bloodbrothers.authenticationservice.Repository;

import com.bloodbrothers.authenticationservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(" select u from User u " +" where u.nom = ?1")
    Optional<UserDetails> findUserWithName(String username);

}
