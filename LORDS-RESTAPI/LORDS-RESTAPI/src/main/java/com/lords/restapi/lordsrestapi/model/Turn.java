package com.lords.restapi.lordsrestapi.model;

public class Turn {
	
	private int heroesMuertos = 0;
	private int bestiasMuertas = 0;

	
	private String teamWinner;
	
    private Personajes ganadorRound;
	
	

	public Turn(int heroesMuertos, int bestiasMuertas, String teamWinner, Personajes ganadorRound) {
		this.heroesMuertos = heroesMuertos;
		this.bestiasMuertas = bestiasMuertas;
		this.teamWinner = teamWinner;
	
		this.ganadorRound = ganadorRound;
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

	public Personajes getGanadorRound() {
		return ganadorRound;
	}

	public void setGanadorRound(Personajes ganadorRound) {
		this.ganadorRound = ganadorRound;
	}
	
	
}
