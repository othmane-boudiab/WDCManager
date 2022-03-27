package com.wdcmanager.DAO;

import com.wdcmanager.entity.TypesAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesActDAO extends JpaRepository<TypesAct, Long> {
}
