package com.wdcmanager.services;

import com.wdcmanager.DAO.ActiviteDAO;
import com.wdcmanager.entity.Activite;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

@AllArgsConstructor
public class ActiviteService implements Service<Activite>{

    @Autowired
    private final ActiviteDAO activiteDAO;

    @Override
    public List<Activite> getAll() {
        return activiteDAO.findAll();
    }

    @Override
    public Activite get(Long id) {
        return activiteDAO.getById(id);
    }

    @Override
    public Activite add(Activite activite) {
        return activiteDAO.save(activite);
    }

    @Override
    public boolean delete(Activite activite) {
        try {
            activiteDAO.delete(activite);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
