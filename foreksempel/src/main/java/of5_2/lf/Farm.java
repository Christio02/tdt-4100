package of5_2.lf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Farm implements Iterable<Animal>, Comparable<Farm> {

    private List<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<Animal>(this.animals);
    }

    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Farm annenFarm) {
        // if (this.getAnimals().size() < annenFarm.getAnimals().size())
        //     return -1;
        // else if (this.getAnimals().size() > annenFarm.getAnimals().size())
        //     return 1;
        // else{
        //     return 0;
        // }

        return this.getAnimals().size() - annenFarm.getAnimals().size();


    }

}
