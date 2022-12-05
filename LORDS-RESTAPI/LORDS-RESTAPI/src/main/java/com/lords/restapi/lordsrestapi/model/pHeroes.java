package com.lords.restapi.lordsrestapi.model;

public class pHeroes extends Personajes{

    private Heroes heroes;

    public pHeroes(Heroes heroes,Integer id, String nombre, Integer ataque, Integer vida, Integer armadura) {
        super(id,nombre, ataque, vida, armadura);
        this.heroes = heroes;
    }

    public Heroes getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }

}
