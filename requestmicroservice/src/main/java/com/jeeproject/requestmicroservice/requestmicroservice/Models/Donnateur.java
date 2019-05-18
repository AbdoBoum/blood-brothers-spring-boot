package com.jeeproject.requestmicroservice.requestmicroservice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

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

    @ManyToOne
    private Ville villeDonnateur;

    @ManyToOne
    private GroupSang groupSang;

    @OneToMany(mappedBy = "donnateur")
    Collection<Blog> blogs;

    public Donnateur(String cin, String nom, String prenom, String email, String password, String tele, Ville villeDonnateur, GroupSang groupSang, Collection<Blog> blogs) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.tele = tele;
        this.villeDonnateur = villeDonnateur;
        this.groupSang = groupSang;
        this.blogs = blogs;
    }
}