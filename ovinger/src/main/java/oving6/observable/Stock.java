package oving6.observable;

import java.util.ArrayList;
import java.util.List;


public class Stock {

    private String ticker; //aksjekode
    private double price;  // stock price
    private List<StockListener> stockListeners = new ArrayList<>();

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        if (newPrice <= 0) {
            throw new IllegalArgumentException("Cannot set stock price to less or equalt to 0");
        }
        double oldPrice = this.price; // gets oldPrice
        this.price = newPrice; // sets newPrice
        alertStockListener(oldPrice, newPrice); // calls alertStockListeners when this method is called
    }

    public String getTicker() {
        return this.ticker;
    }

    public double getPrice() {
        return this.price;
    }


    public void addStockListener(StockListener newListener) {
        stockListeners.add(newListener); // adds newListener to arraylist
    }

    public void removeStockListener(StockListener listener) {
        int listenerIndex = stockListeners.indexOf(listener);
        stockListeners.remove(listenerIndex); // removes correct listener from index
    }

    private void alertStockListener(double oldPrice, double newPrice) {
        for (StockListener stockListener : stockListeners) { // goes through all listeners
            stockListener.stockPriceChanged(this, oldPrice, newPrice); // sets ticker to (this) Stock object, and sets oldPrice and Newprice
    }

    }

    public List<StockListener> getStockListeners() {
        return this.stockListeners;
    }

    @Override
    public String toString() {
        return "{" +
            " ticker='" + getTicker() + "'" +
            ", price='" + getPrice() + "'" +
            ", stockListeners='" + getStockListeners() + "'" +
            "}";
    }


}