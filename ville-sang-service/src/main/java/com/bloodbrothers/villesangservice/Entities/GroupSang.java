package com.bloodbrothers.villesangservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class GroupSang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private long id;

    @Column(name = "nom_group")
    private String nom;

    public GroupSang(String nom) {
        this.nom = nom;
    }
}