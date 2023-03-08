package of5_2.kode;

import java.util.Iterator;
import java.util.function.Predicate;

public class YoungAnimalPredicate implements Predicate<Animal> {

    @Override
    public boolean test(Animal animal) {
       return animal.getAge() <= 2;

    } 

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Dog("Ludo", 12));
        farm.addAnimal(new Dog("Fido", 0));
        farm.addAnimal(new Chicken("Peter", 1));
        farm.addAnimal(new Chicken("Albert", 4));

        Iterator<Animal> iterator = new FilterAnimalsIterator(farm, (a -> a.getAge() <= 2));
        while (iterator.hasNext()) {
            iterator.next().makeSound();
        }

       Iterator<Animal> iterator2 = new FilterAnimalsIterator(farm, (a -> a instanceof Dog));
       while (iterator.hasNext()) {
           iterator.next().makeSound();
       }
      

       long count = 
       farm.getAnimals()
       .stream()
       .filter(a -> a instanceof Dog)
       .filter(a -> a.getAge() <= 5)
       .count();

       System.out.println(count);
    }

}
    

