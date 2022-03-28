package com.wdcmanager.controllers;

import com.wdcmanager.entity.Exercice;
import com.wdcmanager.services.ExerciceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/exercice")
public class ExerciceController {

    @Autowired
    private ExerciceService exerciceService;

    @GetMapping("/")
    public List<Exercice> getAll(){
        return exerciceService.getAll();
    }

    @GetMapping("/find/{id}")
    public Exercice getById(@RequestBody Long id){
        return exerciceService.get(id);
    }

    @PostMapping("/add")
    public Exercice add(@RequestBody Exercice exercice){
        return exerciceService.add(exercice);
    }

    @PutMapping("/edit/{id}")
    public Exercice edit(@RequestBody Exercice exercice,@PathVariable("id") Long id){
        return exerciceService.edit(exercice);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@RequestBody Exercice exercice){
        return exerciceService.delete(exercice);
    }
}
