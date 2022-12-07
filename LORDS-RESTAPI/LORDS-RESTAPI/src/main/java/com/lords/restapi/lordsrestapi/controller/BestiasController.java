package com.lords.restapi.lordsrestapi.controller;

import com.lords.restapi.lordsrestapi.model.pBestias;
import com.lords.restapi.lordsrestapi.service.PersonajeDAOService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bestias")
public class BestiasController {

    private PersonajeDAOService service;

    public BestiasController(PersonajeDAOService service){
        this.service = service;
    }

    @GetMapping("/list")
    public List<pBestias> retrieveAllHeroes(){
        return service.findAllBeast();
    }

    //GET one beast by id
    @GetMapping("list/{id}")
    public pBestias retrieveHeroes(@PathVariable Integer id){
        return service.findBeast(id);
    }

    //POST create a beast
    @PostMapping("/add")
    public void createBeast(@RequestBody pBestias pbestia){
        service.save(pbestia);
    }
}
