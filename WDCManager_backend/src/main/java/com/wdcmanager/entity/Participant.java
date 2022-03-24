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
@PrimaryKeyJoinColumn(name = "participant_id")
@Entity
@Table(name = "participants")
public class Participant extends Utilisateur {

    @Column(name = "domaine")
    private String domaine;

    @Column(name = "structure")
    private String structure;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;

//    @ManyToOne
//    @JoinColumn(name = "participant_id")
//    private Utilisateur participant;


}