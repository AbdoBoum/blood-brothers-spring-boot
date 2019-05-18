package com.BloodDonation.Centre.model;

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
@GeneratedValue
private long idVille;

private String nomVille;

@OneToMany(mappedBy = "villeCentre")
private List<Centre> centres;

@OneToMany(mappedBy = "villeDonnateur")
private List<Donnateur> donnateurs;

}
