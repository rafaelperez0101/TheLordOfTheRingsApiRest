package com.lordsapp.lords_restapi.controller;

import com.lordsapp.lords_restapi.model.Personajes;
import com.lordsapp.lords_restapi.service.PersonajesDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {

    PersonajesDaoService service;

    PersonajesController(PersonajesDaoService service){
        this.service = service;
    }

    @GetMapping("/verTodos")
    public List<Personajes> retrieveAllPersonajes(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Personajes retrieve(@PathVariable Integer id){
        return service.findOnePerOne(id);
    }

}
