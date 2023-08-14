package com.skilldistillery.cardgame.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgame.entities.Dealer;
import com.skilldistillery.cardgame.entities.Deck;
import com.skilldistillery.cardgame.entities.Hand;
import com.skilldistillery.cardgame.entities.Player;

public class BlackjackApp {
	Scanner kb = new java.util.Scanner(System.in);

	private Dealer dealer = new Dealer();
	private Player player = new Player();
	private Deck deck = new Deck();

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.play();
	}

	public void play() {
		System.out.println();
		System.out.println("***** Welcome to Blackjack *****");
		System.out.println();
		dealCards();
		playersHandValue();
		if (player.getHandValue() >22) {
			checkWinner();
			quit();
		}
		else {
			
			playerOptions(kb);
			checkWinner();
			player.clear();
			dealer.clear();
			play();
			kb.close();
			
		}
	}

	public void dealCards() {
		dealer.shuffle();
		deck.shuffle();
		player.hit(deck.dealCard());
		player.showFirstCard();
		dealer.dealsToPlayer();
		System.out.println("Dealers 1st card is *Face Down*");
		player.hit(deck.dealCard());
		player.showSecondCard();
		dealer.dealsToPlayer();
		dealer.viewDealersSecondCard();
		System.out.println();
		dealer.initialDealersHand();
		System.out.println("Players hand: " + player.toString());
		System.out.println();
	}

	public void playersHandValue() {
		System.out.println("Players hand value is : " + player.getHandValue());

	}

	public void dealersHandValue() {
		System.out.println("Dealers hand value is: " + dealer.getHandValue());
	}

	public void playerOptions(Scanner scanner) {
		System.out.println();
		System.out.println("***** Please enter a number 1-3 *****");
		System.out.println("1. Hit me!");
		System.out.println("2. Stand  ");
		

		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			playerHit();
			break;
		case 2:
			dealersTurn();
			break;
		
		default:
			System.out.println("You have entered an invalid number, please enter 1 or 2");
			playerOptions(kb);
			break;
		}
		

	}

	public void dealersTurn() {

		System.out.println("Now its the dealers turn");
		System.out.println("The dealer now flips the face down card and the dealers hand is: ");
		System.out.println(dealer.toString());
		dealersHandValue();

		while (true) {
			if (dealer.getHandValue() < 17) {

				dealer.dealsToPlayer();
				System.out.println(dealer.toString());

			}
			if (dealer.getHandValue() > 17 & dealer.getHandValue() < 22) {
				System.out.println("Dealer stays at: " + dealer.getHandValue());
				break;

			}
			if (dealer.getHandValue() == 21) {
				checkWinner();
				break;
			}
			if (dealer.getHandValue() > 21) {
				System.out.println("Dealer busts, you win!");
				break;
			}
		}

	}

	public void playerHit() {
		player.hit(deck.dealCard());
		System.out.println(player.toString());
		if (player.getHandValue() > 21) {
			System.out.println();
			System.out.println("Hand Value: " + player.getHandValue() + " BUST, you lose.");
			quit();
		} 
		 if (player.getHandValue() < 21) {
			playersHandValue();
			playerOptions(kb);
		}
		else {
			dealersTurn();
			checkWinner();
		}

	}

	public void quit() {
		System.out.println("Goodbye!");

	}

	public void checkWinner() {

		if (player.getHandValue() > dealer.getHandValue() & player.getHandValue() < 22) {
			System.out.println("Player wins");
			
		}
		if (player.getHandValue() < dealer.getHandValue() & dealer.getHandValue() < 22) {

			System.out.println("Dealer wins");
		}

		if (player.getHandValue() == dealer.getHandValue())

			System.out.println("push");

	}

	public void checkBlackJack() {

		if (player.getHandValue() == 21) {
			System.out.println("WINNER WINNER CHICKEN DINNER");
			quit();

		}
	}

}
