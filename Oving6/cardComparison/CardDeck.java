package cardComparison;

import java.util.ArrayList;

public class CardDeck {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	private ArrayList<Card> hearts = new ArrayList<Card>();
	private ArrayList<Card> diamond = new ArrayList<Card>();
	private ArrayList<Card> cucumber = new ArrayList<Card>();
	
	private void makeDeck(int n) {
		for (int i = 1; i <= n; i++){
				deck.add(new Card('S', i));
				hearts.add(new Card('H', i));
				diamond.add(new Card('D', i));
				cucumber.add(new Card('C', i));
		}
		deck.addAll(hearts); deck.addAll(diamond); deck.addAll(cucumber);
	}
	
	public int getCardCount(){
		return deck.size();
	}
	
	public Card getCard(int n){
		if (0 <= n && n <= getCardCount()){
			return deck.get(n);
		} else{
			throw new IllegalArgumentException("Invalid n value");
		}
	}
	
	private boolean isvalidN(int n){
		return 1 <= n && n <= 13;
	}
	
	public void deal(CardHand name, int n){
		if (getCardCount() < n){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < n; i ++){
			int topCardIndex = getCardCount() - 1;
			Card card = deck.get(topCardIndex);
			name.addCard(card);
			deck.remove(topCardIndex);
		}
	}
	
	public void shufflePerfectly(){
		int deckSize = getCardCount();
		int halfDeckSize = deckSize / 2;
		ArrayList<Card> temp = new ArrayList<Card>();
		temp.addAll(deck);
		deck.clear();
		for (int i = 0; i < halfDeckSize; i++){
			deck.add(temp.get(i));
			deck.add(temp.get(i + halfDeckSize));
		}
		if (deckSize % 2 == 1){
			deck.add(temp.get(deckSize-1));
		}
	}
	
	@Override
	public String toString() {
		return "CardDeck [deck=" + deck + "]";
	}
	

	CardDeck(int n){
		if (!isvalidN(n)){
			throw new IllegalArgumentException();
		}
		makeDeck(n);
	}
}
