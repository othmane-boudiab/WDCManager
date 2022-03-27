package com.wdcmanager.DAO;

import com.wdcmanager.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteDAO extends JpaRepository<Activite, Long> {
}
