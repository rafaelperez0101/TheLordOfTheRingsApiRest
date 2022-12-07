package com.lords.restapi.lordsrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lords.restapi.lordsrestapi.model.Turn;
import com.lords.restapi.lordsrestapi.model.pHeroes;
import com.lords.restapi.lordsrestapi.service.PersonajeDAOService;
import com.lords.restapi.lordsrestapi.service.TurnDaoService;

@RestController
@RequestMapping("/turn")
public class TurnController {

    private TurnDaoService service;

    @Autowired
    public TurnController(TurnDaoService service){
        this.service = service;
    }

    //GET heroes
    @GetMapping("/pelea")
    public List<Turn> turno(){
        
    	
    	return service.getTurno();

    }

  

}