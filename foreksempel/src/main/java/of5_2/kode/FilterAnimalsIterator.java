package of5_2.kode;

import java.util.Iterator;
import java.util.function.Predicate;

public class FilterAnimalsIterator implements Iterator<Animal> {

    private Farm farm;
    private int pos;
    private Predicate<Animal> predicate;

    public FilterAnimalsIterator(Farm farm, Predicate<Animal> predicate) {
        this.farm = farm;
        this.pos = this.nextLegalIndex(0); // starts iterating from legal 0 index (e.g. even if number 5 is the first element on 0 index, we skip it)

        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        int nextIndex = this.nextLegalIndex(this.pos);
        return nextIndex < this.farm.getAnimals().size();
    }

    private int nextLegalIndex(int j) {
        for (int i = j; i < this.farm.getAnimals().size(); i++) {
            Animal currentAnimal = this.farm.getAnimals().get(i); // gets current animal on index

            if (predicate.test(currentAnimal)) {
                return i;
            }

        }
        return this.farm.getAnimals().size();


    }

    @Override
    public Animal next() {
        Animal animal = this.farm.getAnimals().get(pos);
        this.pos = this.nextLegalIndex(this.pos + 1);

        return animal;
        
    }


    
}
