package com.wdcmanager.services;

import com.wdcmanager.DAO.ParticipantDAO;
import com.wdcmanager.entity.Participant;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;
@AllArgsConstructor
public class ParticipantService implements Service<Participant>{

    @Autowired
    private final ParticipantDAO participantDAO;

    @Override
    public List<Participant> getAll() {
        return participantDAO.findAll();
    }

    @Override
    public Participant get(Long id) {
        return participantDAO.getById(id);
    }

    @Override
    public Participant add(Participant participant) {
        return participantDAO.save(participant);
    }

    @Override
    public boolean delete(Participant participant) {
        try {
            participantDAO.delete(participant);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
