package com.wdcmanager.controllers;

import com.wdcmanager.entity.Responsable;
import com.wdcmanager.services.ResponsableService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/responsable")
public class ResponsableController {

    @Autowired
    private ResponsableService responsableService;

    @GetMapping("/")
    public List<Responsable> getAll(){
        return responsableService.getAll();
    }

    @GetMapping("/find/{id}")
    public Responsable getById(@RequestBody Long id){
        return responsableService.get(id);
    }

    @PostMapping("/add")
    public Responsable add(@RequestBody Responsable responsable){
        return responsableService.add(responsable);
    }

    @PutMapping("/edit/{id}")
    public Responsable edit(@RequestBody Responsable responsable,@PathVariable("id") Long id){
        return responsableService.edit(responsable);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@RequestBody Responsable responsable){
        return responsableService.delete(responsable);
    }
}
