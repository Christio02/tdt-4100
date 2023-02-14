package practice.interfaces;

interface WaterBottleInterface { // an interface is an outline for a class
    
    String color = "Blue";
    String shape = "Cylinder";
    

    
    void fillUp();
    void pourOut();

}

public class InterfaceExample implements WaterBottleInterface {


    @Override
    public void fillUp() {
        System.out.println("It is filled up!");
        
    }
    @Override
    public void pourOut() {
        System.out.println("It is now empty!");
    }

    

    public static void main(String[] args) {
        System.out.println(color);
        System.out.println(shape);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
        ex.pourOut();
    
    
    }
 
    
}
