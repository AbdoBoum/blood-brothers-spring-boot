package com.bloodbrothers.acceuilservice.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    private Long id;

    private String titre;

    private String contenu;

    private String pathImgBlog;

    private Timestamp date;

    private Long idDonnateur;
}
