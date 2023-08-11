package com.skilldistillery.cardgame.entities;

import java.util.Objects;

public class Card {
	private Suit cardSuit;
	private Rank cardRank;
	
	private Card() {
		
	}
	
	public Card(Suit cardSuit, Rank cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	
	}
	

	public Suit getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(Suit cardSuit) {
		this.cardSuit = cardSuit;
	}

	public Rank getCardRank() {
		return cardRank;
	}

	public void setCardRank(Rank cardRank) {
		this.cardRank = cardRank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardRank, cardSuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return cardRank == other.cardRank && cardSuit == other.cardSuit;
	}

	@Override
	public String toString() {
		return cardRank + " of " + cardSuit;
	}
	
	
}
