package com.blooddonation.donorcentrerequest.Entities;

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

    @NotBlank
    private long idVilleCentre;

    public Centre(@NotBlank String nomCentre, @NotBlank String telephoneCentre, @NotBlank String emailCentre, @NotBlank String passwordCentre, @NotBlank String adresseCentre, @NotBlank long idVilleCentre) {
        this.nomCentre = nomCentre;
        this.telephoneCentre = telephoneCentre;
        this.emailCentre = emailCentre;
        this.passwordCentre = passwordCentre;
        this.adresseCentre = adresseCentre;
        this.idVilleCentre = idVilleCentre;
    }
}