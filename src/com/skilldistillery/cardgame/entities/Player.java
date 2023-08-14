package com.skilldistillery.cardgame.entities;

import com.skilldistillery.cardgame.blackjack.app.BlackjackHand;

public class Player {

	protected Hand playerHand;
	protected Deck deck;
	protected Card card;
	
	public Player() {
		playerHand = new BlackjackHand();
	}

	public Player(Hand playerHand) {
		this.playerHand = playerHand;
	}



	public void hit(Card card) {
		playerHand.addCard(card);	}

	public boolean stand() {
		return false;
	}
	
	public void clear() {
		playerHand.clear();
	}

	public void showFirstCard() {
		System.out.println("Players 1st card is: " + playerHand.getHand().get(0));

	}
	public void showSecondCard() {
		System.out.println("Players 2nd card is: " + playerHand.getHand().get(1));

	}
	public int getHandValue() {
		
		return playerHand.getHandValue();
	}
	
	public Hand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}
	

	@Override
	public String toString() {
		return  "" + playerHand;
	}

}
