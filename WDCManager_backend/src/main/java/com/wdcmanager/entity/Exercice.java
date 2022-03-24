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
@Table(name = "exercices")
public class Exercice {

    enum ExerciseStatus {
        IN_PROGRESS,
        COMPLETED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id", nullable = false)
    private Long exerciseId;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "status")
    private ExerciseStatus status;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @OneToOne()
    private Activite activiteId;

}