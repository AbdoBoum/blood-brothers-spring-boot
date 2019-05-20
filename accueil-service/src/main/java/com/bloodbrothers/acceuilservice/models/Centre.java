package com.bloodbrothers.acceuilservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Centre {

    private long id;
    private String nomCentre;

    private String telephoneCentre;

    private String emailCentre;

    private String passwordCentre;

    private String adresseCentre;

    private long idVilleCentre;

}