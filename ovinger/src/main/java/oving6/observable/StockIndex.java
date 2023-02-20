package oving6.observable;

import java.util.ArrayList;
import java.util.List;

public class StockIndex implements StockListener {

    private String name;
    private double index;
    private List<Stock> listStocks = new ArrayList<>();
    
    
    public StockIndex(String name) {
        this.name = name;

    }

    public StockIndex(String name, Stock stock) {
        this.name = name;
        this.listStocks.add(stock);
    }

    public StockIndex(String name, Stock... stock) {
        this.name = name;
    }

    public void addStock(Stock stock) {
        if (this.listStocks.contains(stock)) {
            throw new IllegalArgumentException("Can't add duplicate stock!");
        }
        listStocks.add(stock);
        this.index += stock.getPrice(); // adds stock object price to index
        stock.addStockListener(this);
    }

    public void removeStock(Stock stock) {
        this.index -= stock.getPrice(); // removes stock object price from index
    }

    public double getIndex() {
        return this.index;
    }

    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {
        double total = 0.0;
        for (Stock stock2 : listStocks) {
            if (stock == stock2) {
                total += newValue;
            }
            else {
                total += stock2.getPrice();
            }
            
        }
        index = total / listStocks.size();
    }

    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", index='" + getIndex() + "'" +
            "}";
    }

    public List<Stock> getListStocks() {
        return this.listStocks;
    }

    public String getName() {
        return this.name;
    }

    


    
}
