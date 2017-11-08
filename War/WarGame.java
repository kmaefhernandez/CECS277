/*
 * Jon Ham 014518840
 * Professor Opkins
 * CECS 277 - T/Th
 * September 21, 2017
*/
package ArrayList;
import java.util.*;

/**
 * Classic War Game.
 * Players played with shuffled half decks. Both players plays a single card. 
 * Higher value card wins the round and winning player adds the pile to his deck.
 * If both cards are same, each player plays 3 cards face down, and 1 face up. 
 * Higher value of face up card wins the match and winning player collects all the cards in the pile.
 * The game plays until a player runs out of cards.
 * 
 * Input: no input
 * Output: Card in play, winning player
 * @author JonHam
 *
 */
public class WarGame {
	/**
	 * Main
	 * @param args 
	 */
	public static void main(String[] args) {
		//create players
		ArrayList<Card> player1 = new ArrayList<Card>(); 
		ArrayList<Card> player2 = new ArrayList<Card>();
		
		//initialize starting deck
		Deck deck = new Deck();
		deck.shuffle();
		
		//initialize players' decks
		Deck p1 = new Deck(player1);
		Deck p2 = new Deck(player2);
		
		//use starting deck to split into individual decks
		p1.splitDeck(1, deck);
		p2.splitDeck(2, deck);

		//start playing
		boolean invalid = true;
		while(invalid){
			//check if players have enough cards, if not end the game
			if (p1.deckSize() > 0 && p2.deckSize() > 0){
				Card c1 = p1.deal();
				System.out.println("Player 1 plays " + c1);
				
				Card c2 = p2.deal();
				System.out.println("Player 2 plays " + c2);
				
				// if player 1 plays lower card than player 2, p1 wins, add pile to p2's deck
				if(c1.getRank() < c2.getRank()){
					System.out.println("Player 2 wins the round");
					p2.addToDeck();
				// vice versa
				}else if(c1.getRank() > c2.getRank()){
					System.out.println("Player 1 wins the round");
					p1.addToDeck();	
				// if tie, go to war. Will loop until war is over
				}else{ 
					boolean valid_war = true;
					do{
						//check if players have enough cards, if not end the game
						if(p1.deckSize() > 0 && p2.deckSize() > 0){
							System.out.println();
							System.out.print("Initiating War:\n");
							p1.deal();
							System.out.println("War card for player 1 is X of X");
							p2.deal();
							System.out.println("War card for player 2 is X of X");
							
							//check if players have enough cards, if not end the game
							if(p1.deckSize() > 0 && p2.deckSize() > 0){
								p1.deal();
								System.out.println("War card for player 1 is X of X");
								p2.deal();
								System.out.println("War card for player 2 is X of X");
								
								//check if players have enough cards, if not end the game
								if(p1.deckSize() > 0 && p2.deckSize() > 0){
									p1.deal();
									System.out.println("War card for player 1 is X of X");
									p2.deal();
									System.out.println("War card for player 2 is X of X");
									System.out.println();
									
									//check if players have enough cards, if not end the game
									if(p1.deckSize() > 0 && p2.deckSize() > 0){
										System.out.print("WAR:\n");
										c1 = p1.deal();
										System.out.println("Player 1 plays " + c1);
										c2 = p2.deal();
										System.out.println("Player 2 plays " + c2);
										
										// if player 1 plays lower card than player 2, p1 wins, add pile to p2's deck
										if(c1.getRank() < c2.getRank()){
											System.out.println("Player 2 wins the round");
											System.out.println();
											p2.addToDeck();
											valid_war = false;
										// vice versa
										}else if(c1.getRank() > c2.getRank()){
											System.out.println("Player 1 wins the round");
											System.out.println();
											p1.addToDeck();
											valid_war = false;
										}
									}
								}else{
									//break out of war
									valid_war = false;
									//break out of game
									invalid = false;
									
									if(p1.deckSize() == 0){
										System.out.println("Player 2 wins the game.");
									}else{
										System.out.println("Player 1 wins the game.");
									}
								}
							}else{
								valid_war = false;
								invalid = false;
								if(p1.deckSize() == 0){
									System.out.println("Player 2 wins the game.");
								}else{
									System.out.println("Player 1 wins the game.");
								}
							}

						}else{
							valid_war = false;
							invalid = false;
							if(p1.deckSize() == 0){
								System.out.println("Player 2 wins the game.");
							}else{
								System.out.println("Player 1 wins the game.");
							}
						}
					}
					while(valid_war);
				}
			}else{
				invalid = false;
				if(p1.deckSize() == 0){
					System.out.println("Player 2 wins the game.");
				}else{
					System.out.println("Player 1 wins the game.");
				}
			}
		}
	}
}

