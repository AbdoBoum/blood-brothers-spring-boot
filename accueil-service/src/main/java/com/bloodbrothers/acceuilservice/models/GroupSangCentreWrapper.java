package com.bloodbrothers.acceuilservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupSangCentreWrapper {
    private List<GroupSangCentre> groupSangCentres;
}
