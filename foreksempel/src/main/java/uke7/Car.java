package uke7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

<<<<<<< HEAD
public class Car implements Comparator<Car> {
    
    private int seats;
    private String plate;

    public Car(int seats, String plate) {
        this.seats = seats;
        this.plate = plate;
    }

    public int getSeat() {
=======
public class Car implements Comparable<Car>{
    int seats;
    String plate;
    public int getSeats() {
>>>>>>> fagstab/main
        return seats;
    }
    public String getPlate() {
        return plate;
    }
<<<<<<< HEAD
=======
    public Car(int seats, String plate) {
        this.seats = seats;
        this.plate = plate;
    }
>>>>>>> fagstab/main

    @Override
    public String toString() {
        return plate + "("+seats+")";
    }
<<<<<<< HEAD

    public static void main(String[] args) {
        Car car1 = new Car(5, "DN70249");
        Car car2 = new Car(2, "EK65293");
        Car car3 = new Car(4, "CV24568");
        Car car4 = new Car(7, "AA56782");
        Car car5 = new Car(1, "VJ36729");
=======
    public static void main(String[] args) {
        Car car1 = new Car(1, "AA41383");
        Car car2 = new Car(3, "XX41383");
        Car car3 = new Car(7, "VY41383");
        Car car4 = new Car(2, "BE41383");
>>>>>>> fagstab/main

        List<Car> liste = new ArrayList<>();
        liste.add(car1);
        liste.add(car2);
        liste.add(car3);
        liste.add(car4);
<<<<<<< HEAD
        liste.add(car5);
        System.out.println(liste);



        


    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getSeat() - o2.getSeat();
    }



    
=======

        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste);

    }
    @Override
    public int compareTo(Car o) {
        return this.plate.compareTo(o.plate);
    }
>>>>>>> fagstab/main
}
