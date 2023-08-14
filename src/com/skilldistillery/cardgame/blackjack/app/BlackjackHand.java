package com.skilldistillery.cardgame.blackjack.app;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Hand;

public class BlackjackHand extends Hand{

	public BlackjackHand() {
		super();
	}

	@Override
	public int getHandValue() {
		int bjHandValue = 0;
		for (Card card : cards) {
			bjHandValue = bjHandValue + card.getValue();
		}
		return bjHandValue;
	}
	
	
	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust() {
		if (this.getHandValue() > 21) {
			return true;
		} 
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return  cards + "";
	}
	
	
	
	
}
