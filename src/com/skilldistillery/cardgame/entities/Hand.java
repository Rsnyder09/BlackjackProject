package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List<Card> cards;
	
	
	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}
	
	public Hand() {
		cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards.clear();
	}
	
	public abstract int getHandValue();

	

	public List<Card> getHand() {
		return cards;
	}

	public void setHand(List<Card> hand) {
		this.cards = hand;
	}

	@Override
	public String toString() {
		return cards + "";
	}
	
	
	
	
}
