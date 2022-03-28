package com.wdcmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "activites")
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activite_id", nullable = false)
    private Long activiteId;

    @Lob
    @Column(name = "titre")
    private String titre;

    @Lob
    @Column(name = "descriptif")
    private String descriptif;

    @Column(name = "date_debut")
    private LocalDate dateDebut;

    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "etat")
    private Boolean etat;

    @ManyToOne
    @JoinColumn(name = "type_act_id")
    private TypesAct typesAct;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private Responsable responsable;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "exercice_id")
//    private Exercice exerciceId;

}