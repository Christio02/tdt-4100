package oving6.observable;

public class StockMain {

    public static void main(String[] args) {
        Stock google = new Stock("Googl", 125);
        Stock apple = new Stock("aapl", 225);


        StockIndex nasDx = new StockIndex("NASDQ", apple, google);
        System.out.println(nasDx.getListStocks());
        System.out.println(nasDx.getIndex());
        




    }
    
}
