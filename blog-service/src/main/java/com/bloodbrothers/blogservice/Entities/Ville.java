package com.bloodbrothers.blogservice.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ville implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVille;

    private String nomVille;

    @OneToMany(mappedBy = "villeCentre")
    private List<Centre> centres;

    @OneToMany(mappedBy = "villeDonnateur")
    private List<Donnateur> donnateurs;

    public Ville(String nomVille, List<Centre> centres, List<Donnateur> donnateurs) {
        this.nomVille = nomVille;
        this.centres = centres;
        this.donnateurs = donnateurs;
    }
}
