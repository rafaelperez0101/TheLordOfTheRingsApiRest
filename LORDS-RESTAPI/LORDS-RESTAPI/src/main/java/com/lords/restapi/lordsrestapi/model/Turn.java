package com.lords.restapi.lordsrestapi.model;

import java.util.List;

public class Turn {
	
	private int heroesMuertos = 0;
	private int bestiasMuertas = 0;

	
	private String teamWinner;
	
    private List<Personajes> ganadorRound;
	
	



	public Turn(int heroesMuertos, int bestiasMuertas, String teamWinner, List<Personajes> ganadorRound) {
		this.heroesMuertos = heroesMuertos;
		this.bestiasMuertas = bestiasMuertas;
		this.teamWinner = teamWinner;
		this.setGanadorRound(ganadorRound);
	}



	public Turn() {

	}

    

	public int getHeroesMuertos() {
		return heroesMuertos;
	}

	public void setHeroesMuertos(int heroesMuertos) {
		this.heroesMuertos = heroesMuertos;
	}

	public int getBestiasMuertas() {
		return bestiasMuertas;
	}

	public void setBestiasMuertas(int bestiasMuertas) {
		this.bestiasMuertas = bestiasMuertas;
	}

	public String getTeamWinner() {
		return teamWinner;
	}

	public void setTeamWinner(String teamWinner) {
		this.teamWinner = teamWinner;
	}



	public List<Personajes> getGanadorRound() {
		return ganadorRound;
	}



	public void setGanadorRound(List<Personajes> ganadorRound) {
		this.ganadorRound = ganadorRound;
	}

	
	
}
