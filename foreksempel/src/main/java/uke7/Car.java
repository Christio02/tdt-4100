package uke7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparator<Car> {
    
    private int seat;
    private String plate;

    public Car(int seats, String plate) {
        this.seats = seats;
        this.plate = plate;
    }

    public int getSeat() {
        return seat;
    }
    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return plate + "("+seats+")";
    }

    public static void main(String[] args) {
        Car car1 = new Car(5, "DN70249");
        Car car2 = new Car(2, "EK65293");
        Car car3 = new Car(4, "CV24568");
        Car car4 = new Car(7, "AA56782");
        Car car5 = new Car(1, "VJ36729");

        List<Car> liste = new ArrayList<>();
        liste.add(car1);
        liste.add(car2);
        liste.add(car3);
        liste.add(car4);
        liste.add(car5);


        


    }



    
}
