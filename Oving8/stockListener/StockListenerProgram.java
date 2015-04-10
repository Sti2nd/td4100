package stockListener;

public class StockListenerProgram {

	public static void main(String[] args) {
		Stock google = new Stock("Google", 100);
		Stock facebook = new Stock("Facebook", 99);
		StockIndex stockIndex = new StockIndex("stockIndex");
		System.out.println(stockIndex);
	}

}
