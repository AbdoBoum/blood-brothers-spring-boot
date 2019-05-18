package com.bloodbrothers.blogservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Centre centreStock;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupSang groupSangStock;

    private int quantite;

    public Stock(Centre centreStock, GroupSang groupSangStock, int quantite) {
        this.centreStock = centreStock;
        this.groupSangStock = groupSangStock;
        this.quantite = quantite;
    }
}


