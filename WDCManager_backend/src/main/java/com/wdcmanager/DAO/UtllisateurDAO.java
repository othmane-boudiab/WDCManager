package com.wdcmanager.DAO;

import com.wdcmanager.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtllisateurDAO extends JpaRepository<Utilisateur, Long> {
}
