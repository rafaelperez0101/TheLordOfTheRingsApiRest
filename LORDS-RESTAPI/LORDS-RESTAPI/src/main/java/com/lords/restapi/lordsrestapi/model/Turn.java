package com.lords.restapi.lordsrestapi.model;

import java.util.List;

public class Turn {
	
	private int heroesMuertos = 0;
	private int bestiasMuertas = 0;
	private int round = 0;
	
	private String teamWinner;
	private String teamLoser;
	
	public Turn(int heroesMuertos, int bestiasMuertas, int round, String teamWinner, String teamLoser) {
		this.heroesMuertos = heroesMuertos;
		this.bestiasMuertas = bestiasMuertas;
		this.round = round;
		this.teamWinner = teamWinner;
		this.teamLoser = teamLoser;
	}

	public Turn() {

	}

	@Override
	public String toString() {
		return "Turn [heroesMuertos=" + heroesMuertos + ", bestiasMuertas=" + bestiasMuertas + ", round=" + round
				+ ", teamWinner=" + teamWinner + ", teamLoser=" + teamLoser + "]";
	}
	
	
}
