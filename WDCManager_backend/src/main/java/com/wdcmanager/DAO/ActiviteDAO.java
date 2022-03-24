package com.wdcmanager.DAO;

import com.wdcmanager.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiviteDAO extends JpaRepository<Activite, Long> {
}
