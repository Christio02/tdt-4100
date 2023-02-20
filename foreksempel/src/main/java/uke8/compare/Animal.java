package uke8.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Animal implements Comparable<Animal> {
    
    String type;
    int age, feet;
    
    public Animal(String type, int age, int feet) {
        this.type = type;
        this.age = age;
        this.feet = feet;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getFeet() {
        return feet;
    }


    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", age='" + getAge() + "'" +
            ", feet='" + getFeet() + "'" +
            "}";
    }


    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Katt", 3, 4));
        animals.add(new Animal("Hund", 5, 4));
        animals.add(new Animal("Sau", 12, 4));
        animals.add(new Animal("Kylling", 1, 2));
        animals.add(new Animal("Tusenbein", 2, 1300));

        System.out.println(animals);

        Collections.sort(animals, new AnimalComparator());
        Collections.sort(animals);
        System.out.println(animals);
    }

    @Override
    public int compareTo(Animal o) {
        return this.getFeet() - o.getFeet(); // compares yourself to another animal object
    }

}
