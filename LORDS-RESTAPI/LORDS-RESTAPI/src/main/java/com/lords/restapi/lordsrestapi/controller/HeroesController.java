package com.lords.restapi.lordsrestapi.controller;

import com.lords.restapi.lordsrestapi.model.pBestias;
import com.lords.restapi.lordsrestapi.model.pHeroes;
import com.lords.restapi.lordsrestapi.service.PersonajeDAOService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroesController {

    private PersonajeDAOService service;

    public HeroesController(PersonajeDAOService service){
        this.service = service;
    }

    //GET heroes
    @GetMapping("/list")
    public List<pHeroes> retrieveAllHeroes(){
        return service.findAllHeroes();
    }

    //GET one hero by name
    @GetMapping("list/{id}")
    public pHeroes retrieveHeroes(@PathVariable Integer id){
        return service.findHero(id);
    }

    //POST create a hero
    @PostMapping("/add")
    public void createHero(@RequestBody pHeroes pheroe){
        service.save(pheroe);
    }

}
