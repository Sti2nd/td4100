package cardContainer;

public class CardProgram {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck(13);
		CardHand player1 = new CardHand();
		CardHand player2 = new CardHand();
		System.out.println(deck);
		deck.shufflePerfectly();
		System.out.println(deck);
		deck.deal(player1, 5);
		deck.deal(player2, 5);
		System.out.println(deck);
		System.out.println("Player 1: " + player1);
		System.out.println("Player 2: " + player2);
		
		
	}

}
