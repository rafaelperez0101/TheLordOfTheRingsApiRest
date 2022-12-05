package com.lordsapp.lords_restapi.model;

public class Personajes {

    private Integer id;
    private Bestias bestias;
    private Heroes heroes;
    private String name;
    private Integer ataque;
    private Integer vida;

    public Personajes(Integer id, Bestias bestias, String name, Integer ataque, Integer vida) {
        this.id = id;
        this.bestias = bestias;
        this.name = name;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Personajes(Integer id, Heroes heroes, String name, Integer ataque, Integer vida) {
        this.id = id;
        this.heroes = heroes;
        this.name = name;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bestias getBestias() {
        return bestias;
    }

    public void setBestias(Bestias bestias) {
        this.bestias = bestias;
    }

    public Heroes getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "id=" + id +
                ", bestias=" + bestias +
                ", heroes=" + heroes +
                ", name='" + name + '\'' +
                ", ataque=" + ataque +
                ", vida=" + vida +
                '}';
    }
}
