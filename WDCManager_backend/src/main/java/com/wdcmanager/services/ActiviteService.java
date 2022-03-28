package com.wdcmanager.services;

import com.wdcmanager.repository.ActiviteDAO;
import com.wdcmanager.entity.Activite;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ActiviteService implements Services<Activite> {

    @Autowired
    private final ActiviteDAO activiteDAO;

    @Override
    public List<Activite> getAll() {
        return activiteDAO.findAll();
    }

    @Override
    public Activite get(Long id) {
        return activiteDAO.findById(id).get();
    }

    @Override
    public Activite add(Activite activite) {
        return activiteDAO.save(activite);
    }

    @Override
    public Activite edit(Activite activite) {
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
