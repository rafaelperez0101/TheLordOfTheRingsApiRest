package com.lords.restapi.lordsrestapi.service;

import com.lords.restapi.lordsrestapi.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

@Component
public class PersonajeDAOService {
    private static List<pHeroes> pheroes = new ArrayList<>();
    private static List<pBestias> pbestias = new ArrayList<>();

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
