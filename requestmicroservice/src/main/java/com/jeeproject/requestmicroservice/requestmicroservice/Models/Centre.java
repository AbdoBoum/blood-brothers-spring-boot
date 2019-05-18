package com.jeeproject.requestmicroservice.requestmicroservice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Centre {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "nom_centre")
    private String nomCentre;

    @NotBlank
    private String telephoneCentre;

    @NotBlank
    private String emailCentre;

    @NotBlank
    private String passwordCentre;

    @NotBlank
    private String adresseCentre;

    @ManyToOne
    private Ville villeCentre;

    @OneToMany(mappedBy = "centreStock")
    Collection<Stock> stocks;

    @OneToMany(mappedBy = "centreDemande")
    Collection<Demande> demandes;
}