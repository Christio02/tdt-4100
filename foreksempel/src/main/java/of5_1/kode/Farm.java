package of5_1.kode;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Farm implements Iterable<Animal> {

    private List<Animal> animals = new ArrayList<Animal>();
    private String name;

    public Farm(String name) {
        this.name = name;
    }


    public void addAnimal(Animal newAnimal) {
        if (!animals.contains(newAnimal)) {
            animals.add(newAnimal);
        } else {
            throw new IllegalArgumentException("Can't add same animal in list!");
        }
       
    } 

    public List<Animal> getAnimals() { // should not return thi.animals, since then you are refrencing the private field

        return new ArrayList<Animal>(this.animals); // just return a copy of the list
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return "Farm [animals=" + animals + ", name=" + name + "]";
    }


    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }

    public static void main(String[] args) {

        Animal dog1 = new Dog("Figma", 12);
        Animal cat1 = new Cat("E.g.", 3);
        Animal dog2 = new Dog("Hey", 20);
        Animal cat2 = new Cat("Heart", 5);

        Farm farm = new Farm("null");
       

        farm.addAnimal(cat2);
        farm.addAnimal(dog1);
        farm.addAnimal(cat1);
        farm.addAnimal(dog2);
        List<Animal> bondegård = farm.getAnimals();
        
        System.out.println(bondegård);

        // AnimalAgeComparator age = new AnimalAgeComparator();
        // AnimalTypeComparator type = new AnimalTypeComparator();


        // System.out.println(dog2 instanceof Dog);
        // bondegård.sort(null);
        bondegård.sort(null); // sorts animals when Animal Interface extends comparable

        // Collections.sort(bondegård);
        System.out.println(bondegård);

        // for (Animal a : farm) {
        //     a.makeSound();
        // }

        farm.forEach(a -> a.makeSound()); // a lambda expression that goes though list and calls method

    }


    


    

}


