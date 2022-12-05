package com.lordsapp.lords_restapi.service;

import com.lordsapp.lords_restapi.model.Bestias;
import com.lordsapp.lords_restapi.model.Heroes;
import com.lordsapp.lords_restapi.model.Personajes;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

@Component
public class PersonajesDaoService {

    private static List<Personajes> personajesList = new ArrayList<>();

    static {
        personajesList.add(new Personajes(1, Bestias.ORCOS, "Nancy",3,4));
        personajesList.add(new Personajes(2, Heroes.ELFOS, "Wendy",2,3));

    }

    public List<Personajes> findAll(){
        return personajesList;
    }

    public Personajes findOnePerOne(Integer id){
        Predicate<? super Personajes> predicate = personajes -> personajes.getId().equals(id);
        return personajesList.stream().filter(predicate).findFirst().get();
    }

}
