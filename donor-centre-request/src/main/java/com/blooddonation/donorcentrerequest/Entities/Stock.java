package com.blooddonation.donorcentrerequest.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(Stock.IdStock.class)
public class Stock implements Serializable {

    @Id
    private Long CentreId;

    @Id
    private Long groupeSangId;

    private int quantiteStock;

    @Data
    static class IdStock implements Serializable{
        private Long CentreId;
        private Long groupeSangId;
    }
}
