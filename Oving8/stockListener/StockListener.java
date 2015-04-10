package stockListener;

public interface StockListener {
	
	void stockPriceChanged(Stock stock, double oldPrice, double newPrice);

}
