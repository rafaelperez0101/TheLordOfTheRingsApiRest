package com.lords.restapi.lordsrestapi.model;

public class pBestias extends Personajes{

    private Bestias bestias;

    public pBestias(Bestias bestias,Integer id,String nombre, Integer ataque, Integer vida, Integer armadura) {
        super(id,nombre, ataque, vida, armadura);
        this.bestias = bestias;
    }


    public Bestias getBestias() {
        return bestias;
    }

    public void setBestias(Bestias bestias) {
        this.bestias = bestias;
    }
}
