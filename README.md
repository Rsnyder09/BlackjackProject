# BlackjackProject


# Description 
	
This program is a game of blackjack. The Dealer deals a card to the player face up, then a card face down to the dealer, another card face up to the player and a second card face up to the player. Each card rank holds a number (Example two equals 2, five equals 5, ten equals 10, face cards equal 10, and ace equals 11). The goal is to get the players hand to equal 21. If the player is under 21 the player may hit which will take a card from the top of the deck and place it in the players hand. If the player hits and the value of the hand is over 21 then the dealer wins. If the player decides to stand while under the value of 21 then the dealer will flip over the face down card dealt. The dealer will hit until the value of the dealers cards is equal to 17 or over. If the dealers value goes above 21 then the player wins. If the dealers cards value equal the same as the players then the game is a push. 
	
# Technologies Used

-Eclipse 
-Java 
-Google 
-Git 
-Github
-Terminal
-Slack
-Zoom

# Lessons Learned

I kept getting the same card after I would re run the program so I ended up doing a dealer.shuffle and a deck.shuffle to get different cards every time the program ran. 

Im playing with 2 different decks for the player and the dealer…. Not sure what to change to get the same deck. But I feel like ive looked at the code for so long its impossible to find at this point. 

Methods are starting to make a lot of sense to me. 

If the dealers hand is a bust, I still get a print out that the dealer wins… but just a couple of lines above it shows that the player wins. 

Eclipse helped me a lot when I was stuck, sometimes it was wrong and brought me down a rabbit hole but doing sysouts after every change helped me get on the right path. 

I am not comfortable with while loops. And I fell like I needed them over for loops. So I did if statements. I think that’s why I am getting incorrect statements about total value of hand and who won…. 

Reflecting on my issues while doing my homework helped me problem solve and I was able to go back to other issues I was having and fix them. 

I tried my best to make my code dry but don’t feel like I did the best job at it. I also feel like I didn’t use the BlackjackHand class as much as I should… but created it because the uml showed it. 

I tried to make my own uml which helped a little. Writing it out in English first is what really helped me create methods for Player, Dealer class. I felt like I could have added one more player class that extends the original player, but I felt like that made my homework more complex and wasn’t needed. I thought it would make my code less dry so I tried using one player class. Was a little confused because my understanding was we could used the deck/card/player classes for other card games.  So I feel like I added to much to my player class.

Wednesday was very helpful for me. I was able to go back to the NBA Lottery project we did and implement what we learned from that into this weeks homework. Jets was also helpful. 

Feeling like im falling behind at this point… going back to this weeks topics helped me a lot but eclipse fill in made me feel confused at times… I tried to make a story out of my code but at times I didn’t feel like I understood how things worked. This was mostly from when I was getting started on methods in player/dealer class.  Getting the cards to show from the correct index threw me off. I found  a note I had that showed list.get() to show the index of my list. But I thought I had to .remove it so it didn’t keep it in the deck. (reflecting back on this.. the .get() is to show my hand and not remove the card from the deck. I am just confused a lot of the time.. ugh) 

When I would create constructors for dealer/player.. ( I used eclipse to help me out but) I would get my no arg constructor and would already have super() in it(from eclipse)… and I was confused by that. I though no arg constructors were empty… 

Not sure if im supposed to print out how many cards are left in the deck like the example  that was in the Washington post blackjack game, but I left it out.  Because I knew it would be wrong since im playing with 2 different decks. Which is wrong. 

I also found a bug in the program. A couple of times my player would get dealt 2 aces which would land the player over 21 since ace is 11. (didn’t even think about it until I saw it come up but I figured it was ok since ace = 11 was in the instructions.

When the player busts I am unable to get the program to stop.

**I feel like I fixed a lot of the issues listed above 
