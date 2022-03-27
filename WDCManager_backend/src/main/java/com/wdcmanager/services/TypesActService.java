package com.wdcmanager.services;

import com.wdcmanager.DAO.TypesActDAO;
import com.wdcmanager.entity.TypesAct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

@AllArgsConstructor
public class TypesActService implements Services<TypesAct> {

    @Autowired
    private final TypesActDAO typesActDAO;

    @Override
    public List<TypesAct> getAll() {
        return typesActDAO.findAll();
    }

    @Override
    public TypesAct get(Long id) {
        return typesActDAO.getById(id);
    }

    @Override
    public TypesAct add(TypesAct typesAct) {
        return typesActDAO.save(typesAct);
    }

    @Override
    public boolean delete(TypesAct typesAct) {
        try {
            typesActDAO.delete(typesAct);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
