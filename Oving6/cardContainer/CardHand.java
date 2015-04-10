package cardContainer;

import java.util.ArrayList;
import java.util.Iterator;



public class CardHand implements CardContainer {
	
	private ArrayList<Card> handDeck = new ArrayList<Card>();
	
	public int getCardCount(){
		return handDeck.size();
	}
	
	public Card getCard(int n){
		if (validN(n)){
			return handDeck.get(n);
		} else{
			throw new IllegalArgumentException("Invalid n value");
		}
	}

	private boolean validN(int n){
		return n >= 0 && n <= 13;
	}
	
	public Card play(int n){
		Card card = getCard(n);
		handDeck.remove(n);
		return card;
	}
	
	public void addCard(Card card){
		handDeck.add(card);
	}

	@Override
	public String toString() {
		return "" + handDeck;
	}

	@Override
	public Iterator<Card> iterator() {
		handDeck.iterator();
		return null;
	}
	
	
}
