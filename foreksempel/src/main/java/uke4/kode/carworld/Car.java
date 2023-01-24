package uke4.kode.carworld;

import java.util.ArrayList;
import java.util.Collection;

public class Car {

    private Plate plate; // accesses the plate class
    private Person driver; // accesses the Person class
    private Collection<Person> passengers = new ArrayList<>(); // makes a collection of passengers, kinda like a set,
                                                               // but can have copies
    private int seats;

    public Car(String regNr, Person driver, int seats) {
        this.driver = driver;
        this.plate = new Plate(regNr);
        this.passengers = new ArrayList<Person>();
        setSeats(seats);

    }

    private void setPlate(String regNr) {
        if (Plate.isValid(regNr)) {
            this.plate = regNr;
        } else {
            throw new IllegalArgumentException("Ugyldig regnr");
        }

    }

    public void setDriver(Person p) {
        if (p.getAge() >= 18 && p.getLicense()) {
            this.driver = p;
        } else {
            throw new IllegalArgumentException("Personen har ikke førerkort");
        }
    }

    public void setSeats(int seats) {
        if (seats < 1) {
            throw new IllegalArgumentException("Kan ikke ha færre enn 1 sete!");
        }
        this.seats = seats;
    }

    public void addPassenger(Person p) {
        int passenger = this.passengers.size();

        if (this.seats - passenger <= 1) {
            throw new IllegalArgumentException("Ikke plass til flere i bilen!");
        }
        this.passengers.add(p);

    }

    public void removePassenger(Person p) {
        this.passengers.remove(p);
    }

    @Override
    public String toString() {
        return "Car [plate=" + plate + ", driver=" + driver + ", passengers=" + passengers + ", seats=" + seats + "]";
    }

    public static void main(String[] args) {
        Person d = new Person("Jostein", 24, true);
        Person b = new Person("Børge");

        Car car1 = new Car("AB12345", d, 3);
        System.out.println(car1);

        car1.addPassenger(b);
        car1.addPassenger(b);
        car1.removePassenger(b);
        System.out.println(car1);

    }

}
