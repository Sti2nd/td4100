package cardComparison;

public class Card implements Comparable<Card> {
	
	private char suit;
	private int face;
	
	Card(char c, int i){
		if (!isValidSuit(c) || !isValidFace(i)){
			throw new IllegalArgumentException();
		}
		suit = c;
		face = i;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public int getFace(){
		return face;
	}
	
	@Override
	public String toString() {
		return suit + Integer.toString(face);
	}
	
	private boolean isValidSuit(char c){
		return c == 'S' || c == 'H' || c == 'D' || c == 'C';
	}
	
	private boolean isValidFace(int i){
		return 1 <= i && i <= 13;
	}


	public int compareTo(Card compareCard) {
		char thisSuit = this.getSuit();
		int compareSuit = this.getSuit();
		if (thisSuit != compareSuit){
			return thisSuit - compareSuit;
		} else if (thisSuit == compareSuit){
				return this.getFace() - compareCard.getFace();
		} return face;
	}
}
