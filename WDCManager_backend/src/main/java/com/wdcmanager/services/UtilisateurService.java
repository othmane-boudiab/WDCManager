package com.wdcmanager.services;

import com.wdcmanager.DAO.UtllisateurDAO;
import com.wdcmanager.entity.Utilisateur;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;
@AllArgsConstructor
public class UtilisateurService implements Service<Utilisateur>{

    @Autowired
    private final UtllisateurDAO utllisateurDAO;

    @Override
    public List<Utilisateur> getAll() {
        return utllisateurDAO.findAll();
    }

    @Override
    public Utilisateur get(Long id) {
        return utllisateurDAO.getById(id);
    }

    @Override
    public Utilisateur add(Utilisateur utilisateur) {
        return utllisateurDAO.save(utilisateur);
    }

    @Override
    public boolean delete(Utilisateur utilisateur) {
        try {
            utllisateurDAO.delete(utilisateur);
            return true;
        }catch (DataAccessException exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
