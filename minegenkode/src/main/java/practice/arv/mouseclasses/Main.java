package practice.arv.mouseclasses;

public class Main {




    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();

        m1.leftClick();
        m1.rightClick();
        m1.scrollDown();
        m1.scrollUp();

        m2.connect();
    }
    
}
