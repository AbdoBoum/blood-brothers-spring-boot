package com.BloodDonation.Centre.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_blog")
private long id;

@Column(name = "titre_blog")
private String titre;

@Column(name = "contenu_blog")
private String contenu;

@Column(name = "image_blog")
private String pathImgBlog;

@Column(name = "date_blog")
private Timestamp date;

@ManyToOne
private Donnateur donnateur;

}
