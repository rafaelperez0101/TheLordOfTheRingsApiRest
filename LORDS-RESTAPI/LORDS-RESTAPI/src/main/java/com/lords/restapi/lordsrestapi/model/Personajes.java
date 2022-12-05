package com.lords.restapi.lordsrestapi.model;

public class Personajes {

    private  Integer id;
    private String nombre;
    private Integer ataque;
    private Integer vida;
    private Integer armadura;

    public Personajes(Integer id, String nombre, Integer ataque, Integer vida, Integer armadura) {
        this.id = id;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.armadura = armadura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getArmadura() {
        return armadura;
    }

    public void setArmadura(Integer armadura) {
        this.armadura = armadura;
    }
}
