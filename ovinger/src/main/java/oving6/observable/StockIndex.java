package oving6.observable;

import java.util.ArrayList;
import java.util.List;


public class StockIndex implements StockListener {

    private String name;
    private double index = 0;
    private List<Stock> listStocks = new ArrayList<>();
    
    
    // Test failed because of these constructors
    // public StockIndex(String name) {
    //     this.name = name;

    // }

    // public StockIndex(String name, Stock stock) {
    //     this.name = name;
    //     this.listStocks.add(stock);
    //     index += stock.getPrice();
    // }

    public StockIndex(String name, Stock... stocks) {
        this.name = name;
        this.listStocks.addAll(List.of(stocks));
        double tmpIndex = 0;

        for (Stock stock : listStocks) { // go though listStocks and add set new index price to every stocks price
            tmpIndex += stock.getPrice(); // adds up tmpIndex for all stocks in listStocks
            stock.addStockListener(this); // adds THIS index to stock 
        }
        index = tmpIndex;
    }

    public void addStock(Stock stock) {
        if (listStocks.contains(stock)) {
            this.index -= stock.getPrice(); // remove duplicate price at index
        }
        listStocks.add(stock);
        this.index += stock.getPrice(); // adds stock object price to index
        stock.addStockListener(this);
    }

    public void removeStock(Stock stock) {
        if (!this.listStocks.contains(stock)) {
            ; // do nothing 
        }
        else {
            int indexStock = listStocks.indexOf(stock);
            listStocks.remove(indexStock);
            index -= stock.getPrice();
        }
        
    }

    public double getIndex() {
        return this.index;
    }

    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {
        double total = 0.0;
        for (Stock stock2 : listStocks) {
            if (stock == stock2) { // if stock changed is i listStocks
                total += newValue; // add newValue to total
            }
            else {
                total += stock2.getPrice(); // else add stock2 getPrice
            }
            
            
        }
        index = total; 
        
    }

    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", index='" + getIndex() + "'"  + 
            "}";
    }

    public List<Stock> getListStocks() {
        return this.listStocks;
    }


    public String getName() {
        return this.name;
    }

    


    
}
