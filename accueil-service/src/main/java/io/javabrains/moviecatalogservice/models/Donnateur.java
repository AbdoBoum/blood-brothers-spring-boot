package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donnateur implements Serializable {

    private long id;

    private String cin;

    private String nom;

    private String prenom;

    private String email;

    private String password;

    private String tele;

    private long idVille;

    private GroupSang groupSang;

    private long idGroupSang;
}