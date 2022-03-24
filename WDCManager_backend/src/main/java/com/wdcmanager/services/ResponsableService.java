package com.wdcmanager.services;

import com.wdcmanager.DAO.ResponsableDAO;
import com.wdcmanager.entity.Responsable;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;
@AllArgsConstructor
public class ResponsableService implements Service<Responsable>{

    @Autowired
    private final ResponsableDAO responsableDAO;

    @Override
    public List<Responsable> getAll() {
        return responsableDAO.findAll();
    }

    @Override
    public Responsable get(Long id) {
        return responsableDAO.getById(id);
    }

    @Override
    public Responsable add(Responsable responsable) {
        return responsableDAO.save(responsable);
    }

    @Override
    public boolean delete(Responsable responsable) {
        try {
            responsableDAO.delete(responsable);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
