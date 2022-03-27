package com.wdcmanager.services;

import com.wdcmanager.DAO.TypeDAO;
import com.wdcmanager.entity.Type;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;
@AllArgsConstructor
public class TypeService implements Services<Type> {

    @Autowired
    private final TypeDAO typeDAO;

    @Override
    public List<Type> getAll() {
        return typeDAO.findAll();
    }

    @Override
    public Type get(Long id) {
        return typeDAO.getById(id);
    }

    @Override
    public Type add(Type type) {
        return typeDAO.save(type);
    }

    @Override
    public boolean delete(Type type) {
        try {
            typeDAO.delete(type);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
