package com.bloodbrothers.blogrequestservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDemande;

    private String titleDemande;

    private String descriptionDemande;

    private Timestamp dateDemande;

    private String pathImgDemande;

    private boolean isUrgent;

    private boolean isActive;

    private long idCentre;

    private long idGroupSang;

}