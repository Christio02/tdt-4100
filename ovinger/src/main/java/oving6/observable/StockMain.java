package oving6.observable;

public class StockMain {

    public static void main(String[] args) {
        Stock google = new Stock("Googl", 125);
        Stock apple = new Stock("aapl", 225);


        google.setPrice(130);
        apple.setPrice(215);

        StockIndex nasDx = new StockIndex("NASDQ");
        nasDx.addStock(apple);
        nasDx.addStock(google);
        System.out.println(nasDx);




    }
    
}
