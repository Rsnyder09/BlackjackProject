package com.skilldistillery.enums.drills.cards;

import java.util.Scanner;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Deck;

public class Dealing {

	public static void main(String[] args) {
		Dealing deal = new Dealing();
		deal.play();
		
		
	}
	
	public void play() {
		
			Deck deck = new Deck();
			int howMany= 5;
			
			deck.shuffle();
			
					for(int i = 0; i < howMany; i++) {
						Card dealtCard = deck.dealCard();
						System.out.println(dealtCard + ", ");
					}
					System.out.println(deck.size());

		}
	
	
		
	}

