package com.wdcmanager.repository;

import com.wdcmanager.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantDAO extends JpaRepository<Participant, Long> {
}
