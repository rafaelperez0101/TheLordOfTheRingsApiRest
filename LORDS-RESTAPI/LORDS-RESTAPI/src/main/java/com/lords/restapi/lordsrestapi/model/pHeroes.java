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

	public int tirarDados() {
		

        int dado1 =(int) (Math.random() * 100);
        int dado2 =(int) (Math.random() * 100);

        return ((dado1 > dado2) ? dado1 : dado2);
	}

	
}
