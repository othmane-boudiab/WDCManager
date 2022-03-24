package com.wdcmanager.DAO;

import com.wdcmanager.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantDAO extends JpaRepository<Participant, Long> {
}
