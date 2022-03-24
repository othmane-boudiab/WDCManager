package com.wdcmanager.DAO;

import com.wdcmanager.entity.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciceDAO extends JpaRepository<Exercice, Long> {
}
