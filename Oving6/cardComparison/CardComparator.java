package cardComparison;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
	
	//Ace as biggest card?
	boolean bool;
	char c = 'S';

	CardComparator(boolean bool, char c){
		this.bool = bool;
		if (c == 'H' || c == 'S' || c == 'D' || c == 'C'){
			this.c = c;
		}
	}
	
	private int bigAce(Card o1, Card o2){
		return 0;
	}
	
	@Override
	public int compare(Card o1, Card o2) {
		if (c != 'S'){
			char o1Suit = o1.getSuit();
			char o2Suit = o2.getSuit();
			if (o1Suit == c){
				if (o2Suit == c){
					return 0;
				} else if (o2Suit != c){
					return 1;
				}
			} else {
				int o1face = o1.getFace();
				int o2face = o2.getFace();
				if (o1face == 1){
					if (o2face == 1){
						return 0;
					} else if (o2face != 1){
						return 1;
					}
				}
				return o1.compareTo(o2);
			}
		}
		return 0;
	}

	
	
}
