package com.bloodbrothers.blogrequestservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeWrapper {
    List<Demande> demandes;
}
