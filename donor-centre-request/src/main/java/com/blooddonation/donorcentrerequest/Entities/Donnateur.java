package com.blooddonation.donorcentrerequest.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Donnateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donnateur")
    private long id;

    @Column(name = "cin_donnateur")
    private String cin;

    @Column(name = "nom_donnateur")
    private String nom;

    @Column(name = "prenom_donnateur")
    private String prenom;

    @Column(name = "email_donnateur")
    private String email;

    @Column(name = "password_donnateur")
    private String password;

    @Column(name = "tele_donnateur")
    private String tele;

    @Column(name = "id_ville")
    private long idVille;

    @Column(name = "id_groupsang")
    private long idGroupSang;

}