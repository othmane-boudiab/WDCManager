package com.wdcmanager.services;

import com.wdcmanager.repository.ExerciceDAO;
import com.wdcmanager.entity.Exercice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ExerciceService implements Services<Exercice> {

    @Autowired
    private final ExerciceDAO exerciceDAO;

    @Override
    public List<Exercice> getAll() {
        return exerciceDAO.findAll();
    }

    @Override
    public Exercice get(Long id) {
        return exerciceDAO.findById(id).get();
    }

    @Override
    public Exercice add(Exercice exercice) {
        return exerciceDAO.save(exercice);
    }

    @Override
    public Exercice edit(Exercice exercice) {
        return exerciceDAO.save(exercice);
    }

    @Override
    public boolean delete(Exercice exercice) {
        try {
            exerciceDAO.delete(exercice);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
