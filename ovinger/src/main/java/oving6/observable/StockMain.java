package oving6.observable;

public class StockMain {

    public static void main(String[] args) {
        Stock google = new Stock("Googl", 125);
        Stock apple = new Stock("aapl", 225);


        Observer observer1 = new Observer(apple);
        google.setPrice(130);
        apple.setPrice(215);

        System.out.println(observer1);



    }
    
}
