package com.skilldistillery.cardgame.entities;

import com.skilldistillery.cardgame.blackjack.app.BlackjackHand;

public class Dealer extends Player {

	private Hand hand;
	private Deck deck;

	public Dealer() {
		super();
		this.deck = new Deck();
		this.hand = new BlackjackHand();
		
	}

	public Dealer(Hand hand) {
		super(hand);
	}
	
public int getHandValue() {
		
		return hand.getHandValue();
	}
public void clear() {
	hand.clear();
}
	

	public void dealsToPlayer() {
		hand.addCard(deck.dealCard());

	}


	public void viewDealersSecondCard() {
		System.out.println("Dealers 2nd card is: " + hand.getHand().get(1));

	}
	public void initialDealersHand() {
		System.out.println("Dealers hand:  [*Face Down* , " + hand.getHand().get(1) + "]");
	}

	

	public void shuffle() {
		deck.shuffle();
	}

	@Override
	public String toString() {
		return hand + "";
	}

}
