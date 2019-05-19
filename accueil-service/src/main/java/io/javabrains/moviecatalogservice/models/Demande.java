package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demande implements Serializable {

    private Long idDemande;

    private String titleDemande;

    private String descriptionDemande;

    private Timestamp dateDemande;

    private String pathImgDemande;

    private boolean isUrgent;

    private boolean isActive;

    private Centre idCentreDemande;

    private List<Long> sangGroups;
}