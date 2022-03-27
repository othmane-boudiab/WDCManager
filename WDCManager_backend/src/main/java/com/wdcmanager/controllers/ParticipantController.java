package com.wdcmanager.controllers;

import com.wdcmanager.entity.Participant;
import com.wdcmanager.services.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/")
    public List<Participant> getAll(){
        return participantService.getAll();
    }

    @GetMapping("/find/{id}")
    public Participant getById(@RequestBody Long id){
        return participantService.get(id);
    }

    @PostMapping("/save")
    public Participant save(@RequestBody Participant participant){
        return participantService.add(participant);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(Participant participant){
        return participantService.delete(participant);
    }


}
