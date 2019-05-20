package com.bloodbrothers.acceuilservice.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemandeWrapper {

    List<Demande> demandes;
}
