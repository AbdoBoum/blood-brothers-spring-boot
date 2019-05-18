package com.jeeproject.requestmicroservice.requestmicroservice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Centre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCentre;

    private String emailCentre;

    private String passwordCentre;

    private String nameCentre;

    private String teleCentre;

    private String adresseCentre;

    @ManyToOne
    private Ville villeCentre;

    @OneToMany(mappedBy = "centreDemande")
    Collection<Demande> demandes;

}