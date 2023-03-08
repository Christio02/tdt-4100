package of5_2.kode;

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

    public int getTotalAge() {
        return this.getAnimals().stream()
        .reduce(0, (total, animalAge) -> total + animalAge.getAge(), Integer::sum);
    }

    public int getTotalAge2() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.getAge();
        }
        return sum;
    }

    public List<String> getAnimalNames() {
        return this.getAnimals().stream()
        .map(a -> a.getName())
        .distinct().toList();
    }


    @Override
    public int compareTo(Farm anotherFarm) {
        // if (this.getAnimals().size() > anotherFarm.getAnimals().size()) {
        //     return 1;

        // } else if (anotherFarm.getAnimals().size() > this.getAnimals().size()) {
        //     return -1;

        // } else {
        //     return 0;
        // }

        return this.getAnimals().size() - anotherFarm.getAnimals().size(); // mindre kode og bedre
    }

}
