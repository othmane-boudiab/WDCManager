package com.wdcmanager.services;

import com.wdcmanager.DAO.ParticipantDAO;
import com.wdcmanager.entity.Participant;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ParticipantService implements Services<Participant> {

    @Autowired
    private final ParticipantDAO participantDAO;

    @Override
    public List<Participant> getAll() {
        return participantDAO.findAll();
    }

    @Override
    public Participant get(Long id) {
        return participantDAO.findById(id).get();
    }

    @Override
    public Participant add(Participant participant) {
        return participantDAO.save(participant);
    }

    @Override
    public Participant edit(Participant participant) {
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
