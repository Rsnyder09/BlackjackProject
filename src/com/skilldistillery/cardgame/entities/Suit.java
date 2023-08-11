package com.skilldistillery.cardgame.entities;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");

	private String name;
	
	Suit(String politeName) {
		this.name = politeName;
	}
	
	@Override
		public String toString() {
		return name;
	}
	
}
