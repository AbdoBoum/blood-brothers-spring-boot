package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupSang {

    private Long id;

    private String nom;

    //@OneToMany(mappedBy = "groupSang")
    Collection<Long> donnateurs; //ids donnateurs
}
