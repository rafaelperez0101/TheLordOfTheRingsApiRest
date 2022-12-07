package com.lords.restapi.lordsrestapi.controller;

import com.lords.restapi.lordsrestapi.model.Turn;
import com.lords.restapi.lordsrestapi.service.TurnDaoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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