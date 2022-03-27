package com.wdcmanager.DAO;

import com.wdcmanager.entity.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableDAO extends JpaRepository<Responsable, Long> {
}
