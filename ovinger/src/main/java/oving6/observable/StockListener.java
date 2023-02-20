package oving6.observable;

public interface StockListener {
    
    // a stock listener that keeps listener updated with the stock price, every listener needs this method
    public void stockPriceChanged(Stock stock, double oldValue, double newValue);
}

class Observer implements StockListener {

    private Stock stock;
    
    public Observer(Stock stock) {
        this.stock = stock;
    }
    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {
        
    }
    @Override
    public String toString() {
        return "Observer [stock=" + stock.getTicker() + " Price: " +  stock.getPrice() + "]";
    }

    

    
}
