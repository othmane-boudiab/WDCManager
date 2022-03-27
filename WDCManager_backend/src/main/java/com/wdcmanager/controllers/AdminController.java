package com.wdcmanager.controllers;

import com.wdcmanager.entity.Utilisateur;
import com.wdcmanager.services.UtilisateurService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/")
    public List<Utilisateur> getAll(){
        return utilisateurService.getAll();
    }

    @GetMapping("/find/{id}")
    public Utilisateur getById(@PathVariable("id") Long id){
        return utilisateurService.get(id);
    }

    @PostMapping("/save")
    public Utilisateur save(@RequestBody Utilisateur utilisateur){
        return utilisateurService.add(utilisateur);
    }

    @DeleteMapping("/delet/{id}")
    public boolean delete(@RequestBody Utilisateur utilisateur){
        return utilisateurService.delete(utilisateur);
    }
}
