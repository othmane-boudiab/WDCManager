package com.wdcmanager.controllers;

import com.wdcmanager.entity.Activite;
import com.wdcmanager.services.ActiviteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/activite")
public class ActiviteController {

    @Autowired
    private ActiviteService activiteService;

    @GetMapping("/")
    public List<Activite> getAll(){
        return activiteService.getAll();
    }

    @GetMapping("/find/{id}")
    public Activite getById(@RequestBody Long id){
        return activiteService.get(id);
    }

    @PostMapping("/add")
    public Activite add(@RequestBody Activite activite){
        return activiteService.add(activite);
    }

    @PutMapping("/edit/{id}")
    public Activite edit(@RequestBody Activite activite,@PathVariable("id") Long id){
        return activiteService.edit(activite);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@RequestBody Activite activite){
        return activiteService.delete(activite);
    }


}
