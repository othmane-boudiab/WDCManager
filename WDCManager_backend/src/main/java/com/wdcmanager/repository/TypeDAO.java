package com.wdcmanager.repository;

import com.wdcmanager.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDAO extends JpaRepository<Type, Long> {
}
