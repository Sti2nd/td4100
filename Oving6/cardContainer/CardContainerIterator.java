package cardContainer;

import java.util.Iterator;

public class CardContainerIterator implements Iterator<Card> {
	
	CardContainer container;
	private int i = 0;
	
	public CardContainerIterator(CardContainer container) {
		this.container = container;
	}

	public boolean hasNext(){
		if (i < container.getCardCount()){
			return true;
		}
		return false;
	}

	public Card next() {
		Card card = container.getCard(i);
		i += 1;
		return card;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

	public Iterator<Card> iterator() {
		return container.iterator();
	}
	
}

