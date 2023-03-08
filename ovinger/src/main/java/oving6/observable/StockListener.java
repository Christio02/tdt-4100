package oving6.observable;

public interface StockListener {
    
    // a stock listener that keeps listener updated with the stock price, every listener needs this method
    public void stockPriceChanged(Stock stock, double oldValue, double newValue);
}
