package com.wdcmanager.DAO;

import com.wdcmanager.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtllisateurDAO extends JpaRepository<Utilisateur, Long> {
}
