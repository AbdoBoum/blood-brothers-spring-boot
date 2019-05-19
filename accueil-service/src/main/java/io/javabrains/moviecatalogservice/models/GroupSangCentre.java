package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupSangCentre {

    private GroupSang groupSang;

    private int quantite;
}
