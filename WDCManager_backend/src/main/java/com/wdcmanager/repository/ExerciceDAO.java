package com.wdcmanager.repository;

import com.wdcmanager.entity.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciceDAO extends JpaRepository<Exercice, Long> {
}
