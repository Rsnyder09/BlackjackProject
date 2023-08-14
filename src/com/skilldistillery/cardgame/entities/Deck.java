package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deckOfCards = new ArrayList<>(52);;

	public Deck() {

		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card aCard = new Card(suit, rank);
				deckOfCards.add(aCard);
			}
		}

	}
	public int cardsLeftInDeck() {
		return deckOfCards.size();
	}
	public Card dealCard() {
		Card aCard = deckOfCards.remove(0);
		return aCard;
	}
//	public void dealCard(Hand hand) {
//		hand.addCard(dealCard());
//	}
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}


	public int size() {
		return deckOfCards.size();
	}
	
	
	
}
