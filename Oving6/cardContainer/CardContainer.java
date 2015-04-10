package cardContainer;

import java.util.Iterator;

public interface CardContainer extends Iterable<Card> {

	public int getCardCount();
	
	public Card getCard(int n);
	
	public Iterator<Card> iterator();
	
	
}
