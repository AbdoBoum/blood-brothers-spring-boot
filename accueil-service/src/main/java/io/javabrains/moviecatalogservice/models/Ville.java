package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ville implements Serializable {

    private Long idVille;

    private String nomVille;

    private List<Centre> centres;

    private List<Long> donnateurs;
}