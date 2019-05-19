package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Stock implements Serializable {

    private long CentreId;

    private long groupeSangId;

    private int quantiteStock;

}
