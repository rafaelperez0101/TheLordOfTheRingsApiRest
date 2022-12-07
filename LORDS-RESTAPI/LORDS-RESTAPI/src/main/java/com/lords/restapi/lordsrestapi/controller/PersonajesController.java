package com.lords.restapi.lordsrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {

    @RequestMapping("/inicio")
    public String welcome(){
       return "index";
    }

}
