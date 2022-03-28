package com.wdcmanager.services;

import com.wdcmanager.DAO.UtllisateurDAO;
import com.wdcmanager.entity.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UtilisateurService implements Services<Utilisateur> {

    @Autowired
    private final UtllisateurDAO utllisateurDAO;


    @Override
    public List<Utilisateur> getAll() {
        return utllisateurDAO.findAll();
    }

    @Override
    public Utilisateur get(Long id) {
        return utllisateurDAO.findById(id).get();
    }

    @Override
    public Utilisateur add(Utilisateur utilisateur) {
        return utllisateurDAO.save(utilisateur);
    }

    @Override
    public Utilisateur edit(Utilisateur utilisateur) {
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

    public Utilisateur login(Utilisateur utilisateur){
        return utllisateurDAO.findByEmail(utilisateur.getEmail());
    }
}
