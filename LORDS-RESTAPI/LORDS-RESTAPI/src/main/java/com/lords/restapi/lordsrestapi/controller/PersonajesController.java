package com.lords.restapi.lordsrestapi.controller;

import com.lords.restapi.lordsrestapi.model.Personajes;
import com.lords.restapi.lordsrestapi.model.pHeroes;
import com.lords.restapi.lordsrestapi.service.PersonajeDAOService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {

    @RequestMapping("/inicio")
    public String welcome(){
       return "index";
    }

}
