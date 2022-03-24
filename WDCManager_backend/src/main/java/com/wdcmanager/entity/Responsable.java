package com.wdcmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@PrimaryKeyJoinColumn(name = "responsable_id")
@Entity
@Table(name = "responsables")
public class Responsable extends Utilisateur {


    @Column(name = "domaine")
    private String domaine;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

}