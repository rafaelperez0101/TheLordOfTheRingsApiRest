package com.lords.restapi.lordsrestapi.service;

import com.lords.restapi.lordsrestapi.model.*;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

@Component
public class PersonajeDAOService {
    private static List<pHeroes> pheroes = new ArrayList<>();
    private static List<pBestias> pbestias = new ArrayList<>();

    static{
        pheroes.add(new pHeroes(Heroes.HUMANOS, 0,"Abby",2,3,4));
        pheroes.add(new pHeroes(Heroes.HOBBITS, 1,"Agnes",3,6,5));
        pheroes.add(new pHeroes(Heroes.ELFOS, 2,"Alexa",5,1,2));

        pbestias.add(new pBestias(Bestias.ORCOS, 3,"Daphne",2,3,2));
        pbestias.add(new pBestias(Bestias.TRASGOS, 4,"Ginger",4,4,3));
        pbestias.add(new pBestias(Bestias.ORCOS, 5,"Melody",1,3,4));
    }

    //Mostrar lista de los heroes
    public List<pHeroes>findAllHeroes(){
        return pheroes;
    }

    //Mostrar lista de las bestias
    public List<pBestias>findAllBeast(){
        return pbestias;
    }

    //Buscar hero por nombre
    public pHeroes findHero(Integer id){
        Predicate<? super pHeroes> predicate = pHero -> pHero.getId().equals(id);
        return pheroes.stream().filter(predicate).findFirst().get();
    }

    //Buscar bestia por nombre
    public pBestias findBeast(Integer id){
        Predicate<? super pBestias> predicate = pBeast -> pBeast.getId().equals(id);
        return pbestias.stream().filter(predicate).findFirst().get();
    }

    //Guarda bestias
    public pBestias save(pBestias pBestia){
        pbestias.add(pBestia);
        return pBestia;
    }

    //Guarda heroes
    public pHeroes save(pHeroes pHeroe){
        pheroes.add(pHeroe);
        return pHeroe;
    }
}
