package ArrayList;
import java.util.*;

/**
 * Deck Class for War game. Creates an ArrayList for each collection of cards.
 * @author JonHam
 *
 */
public class Deck {
	/** ArrayList for initial card objects */
	private ArrayList<Card> storage = new ArrayList<Card>();
	/** ArrayList for initial player card objects */
	private ArrayList<Card> new_deck = new ArrayList<Card>();
	/** ArrayList for playing field card objects */
	private ArrayList<Card> pile = new ArrayList<Card>();
	/** Keeps track of current card in the ArrayList */
	private int topCard;
	
	/**
	 * Deck Constructor
	 */
	Deck(){
		refreshDeck();
	}
	
	/**
	 * Populates the Deck ArrayLists with 52 cards in order
	 */
	public void refreshDeck(){
		for(int i = 0; i < 52; i++){
			storage.add(new Card());
		}
		boolean invalid = true;
		while (invalid){
			String suit1 = "spades";
			String suit2 = "clubs";
			String suit3 = "diamonds";
			String suit4 = "hearts";
			int incr = 0;
			for(int s1 = 0; s1 < 13; s1++){
				storage.get(incr).setCard(s1 + 1, suit1);
				incr++;
			}
			for(int s2 = 0; s2 < 13; s2++){
				storage.get(incr).setCard(s2 + 1, suit2);
				incr++;
			}
			for(int s3 = 0; s3 < 13; s3++){
				storage.get(incr).setCard(s3 + 1, suit3);
				incr++;
			}
			for(int s4 = 0; s4 < 13; s4++){
				storage.get(incr).setCard(s4 + 1, suit4);
				incr++;
			}
			invalid = false;
		}
	}
	
	/**
	 * Overloaded Deck constructor
	 * @param player Initial Player ArrayList
	 */
	Deck(ArrayList<Card> player){
		player = new_deck;
	}
	
	/**
	 * Adds cards in playing field to player decks
	 */
	public void addToDeck(){
		for(int i = 0; i < pile.size(); i++){
			new_deck.add(pile.get(i));
			pile.clear();
		}
	}
	
	/**
	 * shuffles the cards in deck
	 */
	public void shuffle(){
		Card temp;
		for(int i = 0; i < 999999; i++){
			int rnd = (int)(Math.random() * 52);
			int rnd2 = (int)(Math.random() * 52);
			Card c1 = storage.get(rnd);
			Card c2 = storage.get(rnd2);
			
			temp = c1;
			c1 = c2;
			c2 = temp;
			
			storage.set(rnd, c1);
			storage.set(rnd2, c2);
		}
	}
	
	/**
	 * Gets the size of deck
	 * @return size of deck
	 */
	public int deckSize(){
		return new_deck.size();
	}
	
	/**
	 * Splits the initial deck into halves and assigns first half to player 1, second half to player 2
	 * @param playerNum determines which player
	 * @param deck initial deck to split
	 */
	public void splitDeck(int playerNum, Deck deck){
		if (playerNum == 1){
			for (int i = 0; i < 26; i++)
				new_deck.add(deck.storage.get(i));
		}else{
			for (int i = 26; i < 52; i++){
				new_deck.add(deck.storage.get(i));
			}
		}
	}
	
	/**
	 * Deals the top card in the deck and removes it. Adds it to playing field pile.
	 * @return the removed card
	 */
	public Card deal(){
		Card delt = new_deck.remove(topCard);
		pile.add(delt);
		return delt;
	}
	
	/**
	 * String representation of Deck
	 */
	public String toString(){
		for(int i = 0; i < 52; i++){
			System.out.println(storage.get(i) + "");
		}
		return "";
	}
	
	/**
	 * String representation of player deck
	 */
	public void showDeck(){
		for(int i = 0; i < new_deck.size(); i++){
			System.out.println(new_deck.get(i) + "");
		}
	}
	
}
