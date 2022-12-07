package com.lords.restapi.lordsrestapi.service;

import java.util.ArrayList;
import java.util.List;

import com.lords.restapi.lordsrestapi.model.Bestias;
import com.lords.restapi.lordsrestapi.model.Heroes;
import com.lords.restapi.lordsrestapi.model.Turn;
import com.lords.restapi.lordsrestapi.model.pBestias;
import com.lords.restapi.lordsrestapi.model.pHeroes;

public class TurnDaoService {

	 private static List<pHeroes> pheroes = new ArrayList<>();
	 private static List<pBestias> pbestias = new ArrayList<>();
	 private static List<Turn> turno = new ArrayList<>();
	    static{
	        pheroes.add(new pHeroes(Heroes.HUMANOS, 0,"Abby",2,3,4));
	        pheroes.add(new pHeroes(Heroes.HOBBITS, 1,"Agnes",3,6,5));
	        pheroes.add(new pHeroes(Heroes.ELFOS, 2,"Alexa",5,1,2));

	        pbestias.add(new pBestias(Bestias.ORCOS, 3,"Daphne",2,3,2));
	        pbestias.add(new pBestias(Bestias.TRASGOS, 4,"Ginger",4,4,3));
	        pbestias.add(new pBestias(Bestias.ORCOS, 5,"Melody",1,3,4));
	        
	        batalla(pheroes, pbestias);
	  }
	
	 public static void batalla(List<pHeroes> heroes, List<pBestias> beasts){


	        for (int i = 0; i < heroes.size(); i++){

	            while (beasts.get(i).getVida() >= 0 && heroes.get(i).getVida() >= 0){

	                int ataqueBestia = beasts.get(i).tirarDados();

	                if(ataqueBestia > heroes.get(i).getArmadura()){

	                  

	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println(heroes.get(i).getNombre() + " recibe un ataque");
	                    System.out.println("Ataque recibido: " + ataqueBestia);
	                    int vida = heroes.get(i).getVida();

	                    if(beasts.get(i) instanceof Orcos){
	                        heroes.get(i).setVida(vida - (ataqueBestia  - (heroes.get(i).getArmadura() - 10)));
	                    }else{
	                       heroes.get(i).setVida(vida - (ataqueBestia  - heroes.get(i).getArmadura() ));
	                    }

	                    System.out.println("Vida restante con la proteccion de la armadura: " +heroes.get(i).getVida());
	                    if (heroes.get(i).getVida() <= 0){
	                        System.out.println("Jugador: " + heroes.get(i).getNombre() + " ha muerto");
	                        System.out.println("------------------------------------------------------------------");
	                        System.out.println("------------------------------------------------------------------");
	                        heroesMuertos++;
	                        break;
	                    }
	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println("------------------------------------------------------------------");

	                }else{
	                    System.out.println("La armadura te defendio");
	                }


	                int ataqueHeroe = 0;

	                if (heroes.get(i) instanceof  Hobbits){

	                    if (beasts.get(i) instanceof Trasgos){
	                        ataqueHeroe = heroes.get(i).tirarDados() - 5;
	                    }else{
	                        ataqueHeroe = heroes.get(i).tirarDados();
	                    }



	                }

	                if (heroes.get(i) instanceof  Elfos){

	                    if (beasts.get(i) instanceof Orcos){
	                        ataqueHeroe = heroes.get(i).tirarDados() + 10;
	                    }else{
	                        ataqueHeroe = heroes.get(i).tirarDados();
	                    }


	                }

	                if(batallones.heroes.get(i) instanceof Humanos){
	                    ataqueHeroe = heroes.get(i).tirarDados();
	                }

	                if(ataqueHeroe > beasts.get(i).getArmadura()){

	                    Thread.sleep(2000);
	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println(beasts.get(i).getNombre() + " recibe un ataque");
	                    System.out.println("Ataque recibido: " + ataqueHeroe);
	                    int vida = beasts.get(i).getVida();
	                    beasts.get(i).setVida(vida - (ataqueHeroe - beasts.get(i).getArmadura()));
	                    System.out.println("Vida restante con la armadura: " + beasts.get(i).getVida());
	                    if (beasts.get(i).getVida() <= 0){
	                        System.out.println("Jugador: " + beasts.get(i).getNombre() + " ha muerto");
	                        System.out.println("------------------------------------------------------------------");
	                        System.out.println("------------------------------------------------------------------");
	                        bestiasMuertas++;
	                        break;
	                    }
	                    System.out.println("------------------------------------------------------------------");
	                    System.out.println("------------------------------------------------------------------");
	                }else{
	                    System.out.println("La armadura te defendio");
	                }
	            }
	        }

	        System.out.println("--------------------------------------");
	        System.out.println("--------------------------------------");
	        System.out.println(bestiasMuertas > heroesMuertos ? board.win("Heroes ganan") : board.win("Bestias ganan"));
	        System.out.println("--------------------------------------");
	        System.out.println("--------------------------------------");


	    }

	public static List<Turn> getTurno() {
		return turno;
	}

	public static void setTurno(List<Turn> turno) {
		TurnDaoService.turno = turno;
	}
	
}
