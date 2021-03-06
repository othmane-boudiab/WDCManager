package com.wdcmanager.services;

import com.wdcmanager.repository.RoleDAO;
import com.wdcmanager.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class RoleService implements Services<Role> {

    @Autowired
    private final RoleDAO roleDAO;

    @Override
    public List<Role> getAll() {
        return roleDAO.findAll();
    }

    @Override
    public Role get(Long id) {
        return roleDAO.getById(id);
    }

    @Override
    public Role add(Role role) {
        return roleDAO.save(role);
    }

    @Override
    public Role edit(Role role) {
        return roleDAO.save(role);
    }

    @Override
    public boolean delete(Role role) {
        try {
            roleDAO.delete(role);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
