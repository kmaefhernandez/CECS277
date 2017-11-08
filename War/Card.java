package ArrayList;

/**
 * Card Class for War game. Creates Card object with values rank and suit.
 * @author JonHam
 *
 */
public class Card {
	/** rank value of card */
	private int rank; 
	/** suit value of card */
	private String suit;
	
	/**
	 * Card constructor
	 */
	Card(){
		rank = 0;
		suit = "blank";
	}
	
	/**
	 * Overloaded Card constructor
	 * @param r rank of card
	 * @param s suit of card
	 */
	Card(int r, String s){
		rank = r;
		suit = s;
	}
	
	/**
	 * Sets the values of cards
	 * @param r rank of card
	 * @param s suit of card
	 */
	public void setCard(int r, String s){
		rank = r;
		suit = s;
	}
	
	/**
	 * Gets the rank value of the card
	 * @return rank value of card
	 */
	public int getRank(){
		return rank;
	}
	
	/**
	 * Gets the suit of the card
	 * @return suit of card
	 */
	public String getSuit(){
		return suit;
	}
	
	/**
	 * String representation of Card object
	 */
	public String toString(){
		if(this.rank == 1){
			return "Ace" + " of " + suit;
		}else if(this.rank == 11){
			return "Jack" + " of " + suit;
		}else if(this.rank == 12){
			return "Queen" + " of " + suit;
		}else if(this.rank == 13){
			return "King" + " of " + suit;
		}else{
			return rank + " of " + suit;
		}
	}
}
