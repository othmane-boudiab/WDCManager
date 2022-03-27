package com.wdcmanager.services;

import com.wdcmanager.DAO.ExerciceDAO;
import com.wdcmanager.entity.Exercice;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

@AllArgsConstructor
public class ExerciceService implements Services<Exercice> {

    @Autowired
    private final ExerciceDAO exerciceDAO;

    @Override
    public List<Exercice> getAll() {
        return exerciceDAO.findAll();
    }

    @Override
    public Exercice get(Long id) {
        return exerciceDAO.getById(id);
    }

    @Override
    public Exercice add(Exercice exercice) {
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
