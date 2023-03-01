package of5_2.kode;

import java.util.Iterator;

public class YoungAnimalsIterator implements Iterator<Animal> {

    private Farm farm;
    private int pos;

    public YoungAnimalsIterator(Farm farm) {
        this.farm = farm;
        this.pos = this.nextLegalIndex(0); // starts iterating from legal 0 index (e.g. even if number 5 is the first element on 0 index, we skip it)
    }

    @Override
    public boolean hasNext() {
        int nextIndex = this.nextLegalIndex(this.pos);
        return nextIndex < this.farm.getAnimals().size();
    }

    private int nextLegalIndex(int j) {
        for (int i = j; i < this.farm.getAnimals().size(); i++) {
            Animal currentAnimal = this.farm.getAnimals().get(i); // gets current animal on index
            if (currentAnimal.getAge() <= 2) {
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

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Dog("Ludo", 12));
        farm.addAnimal(new Dog("Fido", 0));
        farm.addAnimal(new Chicken("Peter", 1));
        farm.addAnimal(new Chicken("Albert", 4));

        Iterator<Animal> iterator = new YoungAnimalsIterator(farm);
        while (iterator.hasNext()) {
            iterator.next().makeSound();
        }
        // for (Iterator<Animal> iterator = new YoungAnimalsIterator(farm);
        // iterator.hasNext();) {
        // iterator.next().makeSound();
        // }
    }
    
}
